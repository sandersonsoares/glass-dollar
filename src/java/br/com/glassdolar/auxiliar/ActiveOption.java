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
public enum ActiveOption {
    
    ACTIVE("Active"),
    HYPER_ACTIVE("Hiper Active"),
    INACTIVE("Inactive");
    
    public String option;
    
    ActiveOption(String option){
        this.option = option;
    }
}
