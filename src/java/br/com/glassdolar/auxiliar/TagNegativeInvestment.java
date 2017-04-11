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
public enum TagNegativeInvestment {
    
    DRAG("Drag Along"),
    HIGH_VAL("High Valuation"),
    UNFRIENDLY_TERMS("Unfriendly terms"),
    REQUIRED_B_SEAT("Required board seat"),
    FAST_NEG("Fast Negociation");
    
    public String tag;
    
    private TagNegativeInvestment(String tag){
        this.tag = tag;
    }
    
    public String toString(){
        switch(this){
            case DRAG:
                return "Drag; Along";
            case HIGH_VAL:
                return "High value";
            case UNFRIENDLY_TERMS:
                return "Unfriendly terms";
            case REQUIRED_B_SEAT:
                return "Required board seat";
            case FAST_NEG:
                return "Fast Negociation";
        }
        return this.tag;
    }
}
