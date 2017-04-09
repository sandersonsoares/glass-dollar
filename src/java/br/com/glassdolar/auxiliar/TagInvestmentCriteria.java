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
public enum TagInvestmentCriteria {
    
    SIGNIFICANT_TRACTION("Significant traction"),
    PROD_MARK_FIT("Produt-Market fit"),
    REVENUES("Revenues"),
    TECHNICAL_FOUNDER("Technical Founder"),
    ABOV_REVENUE("Above 5 mio $ revenue"),
    BIG_VISION("Big vision");
    
    public String tag;
    
    private TagInvestmentCriteria(String tag){
        this.tag = tag;
    }
    
    @Override
    public String toString(){
        switch(this){
            case SIGNIFICANT_TRACTION:
                return "Significant traction";
            case PROD_MARK_FIT:
                return "Product-Market fit";
            case REVENUES:
                return "Revenues";
            case TECHNICAL_FOUNDER:
                return "Technical Founder";
            case ABOV_REVENUE:
                return "Above 5 mio $ revenue";
            case BIG_VISION:
                return "Big vision";
        }
        return this.tag;
    }
}
