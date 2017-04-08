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
public enum TagInvester {
    HANDS_ON("Hands On"),
    OPEN_DOORS("Open doors"),
    GOOD_PORTFOLIO_EXCHANGE("Good portfolio exchange"),
    FORCES_DECISION("Forces decisions"),
    PASSIVE("Passive");
    
    public String tag;
    
    private TagInvester(String tag){
        this.tag = tag;
    }
}
