/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

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
    
    @PostConstruct
    public void init(){
        facade = new Facade();
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
            Usuario user = facade.getUserByEmailAndPassword(login, senha);
            if (user != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
                return "/faces/private/home.xhtml" + LinksUtilBean.FACES_REDIRECT;
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong login or password!", "Wrong login or password!"));
                return "";
            }
        } catch (DAOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Intern process error, contact admin system.", "Intern process error, contact admin system."));
            return "";
        }
    }
    
    public String logout(){
        Usuario perfil = new Usuario();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("user");
        return "/privado/principal.xhtml?faces-redirect=true";
    }
}
