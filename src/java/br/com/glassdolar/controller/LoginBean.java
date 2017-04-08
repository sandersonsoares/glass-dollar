/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.model.Perfil;
import javax.annotation.PostConstruct;
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
    
    public String login(){
        Perfil perfil = new Perfil();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", perfil);
        return "/privado/principal.xhtml?faces-redirect=true";
    }
}