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
public enum TagPartners{
    
    HANDSON("Hands On"), TECHNICAL("Technical Expertise"), MARKETING_NETWORK("Marketing Network"), 
    HELPS_WITH_FOLLOW_ON("Helps With follow on"), LATE("Late"), STRATEGY_SUPPORT("Strategy support");
    
    public String tag;
    
    TagPartners(String valor){
        tag = valor;
        }
    
}
