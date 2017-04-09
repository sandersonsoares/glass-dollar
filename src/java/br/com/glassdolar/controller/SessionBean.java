/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.controller;

import br.com.glassdolar.facade.Facade;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Partner;
import br.com.glassdolar.model.Review;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Girlian Santos
 */
@ManagedBean
@SessionScoped
public class SessionBean {

    private Facade facade;
    private List<Invester> investors;
    private List<Founder> founders;
    private List<Partner> partners;
    private Invester investor;
    private Founder founder;
    private Partner partner;
    private Review review;
    
    public SessionBean(){
        this.founder = new Founder();
        this.investor = new Invester();
        this.partner = new Partner();
        this.review = new Review();
    }
    
    @PostConstruct
    public void init(){
        this.investors = new ArrayList<>();
        this.founders = new ArrayList<>();
    }
    
    public void raringInvestor(Double value){
        this.investor.getReviews().add(review);
        review = new Review();
    }
    
    public void ratingPartner(Double value){
        this.partner.getOveralRating().add(value);
    }
    
}
