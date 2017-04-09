/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Usuario;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Size;

/**
 *
 * @author marce
 */
@ManagedBean
@RequestScoped
public class SingInBean {

    private String email;
    @Size(min=6,max=20, message = "6 is minimum and 20 is the maximum number of characters.")
    private String password;
    private Facade facade;

    @PostConstruct
    public void init() {
        facade = new Facade();
    }

    public String singIn() {
        if (email != null && password != null) {
            Usuario user = new Usuario();
            user.setLogin(email);
            user.setSenha(password);
            facade.saveUser(user);
            return "/faces/index.xhtml" + LinksUtilBean.FACES_REDIRECT;
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Insert a value to e-mail and to password.", "Insert a value to e-mail and to password."));
            return "";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
