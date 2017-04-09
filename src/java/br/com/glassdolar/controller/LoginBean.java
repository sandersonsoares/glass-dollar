/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.dao.UsuarioDao;
import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author marce
 */
@ManagedBean
@RequestScoped
public class LoginBean {
    
    private String login;
    private String senha;
    private Facade facade;
    private Usuario user;
    
    @PostConstruct
    public void init(){
        facade = new Facade();
        user = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String enter(){
        try {
            Usuario user = facade.getUserByEmail(login);
            if (user != null) {
                if(user.getSenha().equals(senha)){
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
                    return "/faces/public/investors.xhtml" + LinksUtilBean.FACES_REDIRECT;
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong password.", "Wrong password."));
                    return "";
                }
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "There is no registration for this email.", "There is no registration for this email."));
                return "";
            }
        } catch (DAOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Intern process error, contact admin system.", "Intern process error, contact admin system."));
            return "";
        }
    }
    
    public boolean getIsLoged(){
        if(user==null) return false;
        return true;
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("user");
        user = null;
        return "/faces/login.xhtml"+LinksUtilBean.FACES_REDIRECT;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
}
