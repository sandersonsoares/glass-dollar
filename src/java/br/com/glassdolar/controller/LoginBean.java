/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.model.Perfil;
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
    
    @PostConstruct
    public void init(){
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
        if (login != null && senha != null && login.equals("admin") && senha.equals("admin")) {
            Perfil perfil = new Perfil();
            perfil.setLogin("admin");
            perfil.setSenha("admin");
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", perfil);
            return "/faces/private/home.xhtml"+LinksUtilBean.FACES_REDIRECT;
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong login or password!", "Wrong login or password!"));
            return "";
        }
    }
    
    public String logout(){
        Perfil perfil = new Perfil();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("user");
        return "/privado/principal.xhtml?faces-redirect=true";
    }
}
