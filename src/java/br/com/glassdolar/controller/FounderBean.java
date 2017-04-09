/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Founder;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Girlian Santos
 */
@ManagedBean
@ViewScoped
public class FounderBean {

    private Founder founder;
    private Facade facade;
    
    public FounderBean(){
        this.founder = new Founder();
    }
    
    
}
