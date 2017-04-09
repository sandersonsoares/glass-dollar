/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author marce
 */
@ManagedBean
@RequestScoped
public class LinksUtilBean implements Serializable {

    public static final String FACES_REDIRECT = "?faces-redirect=true";

    @PostConstruct
    public void init() {

    }

    public String loginPage() {
        return "/faces/login.xhtml" + FACES_REDIRECT;
    }

    public String singUpPage() {
        return "/faces/singup.xhtml" + FACES_REDIRECT;
    }

    public String investorsPage() {
        return "/faces/public/investors.xhtml" + FACES_REDIRECT;
    }

    public String indexPage() {
        return "/faces/index.xhtml" + FACES_REDIRECT;
    }

    public String investorPage() {
        return "/faces/public/investor.xhtml" + FACES_REDIRECT;
    }
}
