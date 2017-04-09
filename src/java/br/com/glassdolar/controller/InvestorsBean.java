/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Invester;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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
    private String name, office, area;
    private Double ticket;
    
    public InvestorsBean(){
        this.invester = new Invester();
        String idString = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
        if(idString != null && !idString.equals("")){
            Long id = Long.valueOf(idString);
            if(id!=null){
                invester = facade.getInvesterById(id);
            }
        }
    }
    
    @PostConstruct
    public void init(){
        this.facade = new Facade();
        this.investors = facade.getAllInvestors();
    }
    
    public void saveInvestor(Invester i){
        facade.saveInvester(i);
    }
    
    public List<Invester> getByName(){
        return facade.getInvestorByName(this.name);
    }
    
    public List<Invester> getByArea(){
        return facade.getInvestorByArea(area);
    }
    
     public List<Invester> getByLocal(){
        return facade.getInvestorByLocal(office);
    }

    public List<Invester> getInvestors(){
        return this.investors;
    }
    
    public List<Invester> getByTicket(){
        return facade.getInvestorByTicket(ticket);
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

    public Facade getFacade() {
        return facade;
    }

    public void setFacade(Facade facade) {
        this.facade = facade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getTicket() {
        return ticket;
    }

    public void setTicket(Double ticket) {
        this.ticket = ticket;
    }
}
