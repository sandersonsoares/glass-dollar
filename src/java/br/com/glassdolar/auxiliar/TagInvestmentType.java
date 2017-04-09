/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.auxiliar;

/**
 *
 * @author Girlian Santos
 */
public enum TagInvestmentType {
    EQUICITY("Equicity"),
    CONVERTIBLE("Convertible"),
    DEBT("Debt"),
    MAJORITY("Majority"),
    MINORITY("Minority");
    
    public String tag;
    
    private TagInvestmentType(String type){
        this.tag = type;
    }
}
