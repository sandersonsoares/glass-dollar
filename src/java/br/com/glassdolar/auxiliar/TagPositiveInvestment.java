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
public enum TagPositiveInvestment{
    TRUS("Trust founder decisions"),
    HANDS("Hands-On"),
    SUPPORT("Supports with follow on");
    
    public String tag;
    
    private TagPositiveInvestment(String tag){
        this.tag = tag;
    }
    
    @Override
    public String toString(){
        switch(this){
            case TRUS: 
                return "Trus founder decisions";
            case HANDS:
                return "Hands-on";
            case SUPPORT:
                return "Supports with follow on";
        }
        return this.tag;
    }
}
