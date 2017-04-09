/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Invester;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Girlian Santos
 */
@ManagedBean
@RequestScoped
public class InvestorsBean {
    
    private Facade facade;
    private List<Invester> investors;
    private Invester invester;
    
    public InvestorsBean(){
        this.invester = new Invester();
    }
    
    @PostConstruct
    public void init(){
        this.facade = new Facade();
        this.investors = facade.getAllInvestors();
    }
    
    public List<Invester> getByName(String name){
        return facade.getInvestorByName(name);
    }
    
    public List<Invester> getByArea(String area){
        return facade.getInvestorByArea(area);
    }
    
     public List<Invester> getByLocal(String local){
        return facade.getInvestorByLocal(local);
    }

    public List<Invester> getInvestors(){
        return this.investors;
    }

    public void setInvestors(List<Invester> investors) {
        this.investors = investors;
    }

    public Invester getInvester() {
        return invester;
    }

    public void setInvester(Invester invester) {
        this.invester = invester;
    }
    
    
}
