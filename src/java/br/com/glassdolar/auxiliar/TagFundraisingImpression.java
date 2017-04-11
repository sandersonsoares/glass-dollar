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
public enum TagFundraisingImpression {
    UND_MODEL("Understood model"),
    ENOUGH_TIME("Enough time"),
    SMART_QUESTION("Smart question"),
    NEVER_HEARD_BACK("Never heard back"),
    FAST_DECISION("Fast decision"),
    PREPARED("Prepared"),
    ONTIME("On time"),
    RESP_OF_FOUNDER_TIME("Respectfull of founder time");
    
    public String tag;
    
    private TagFundraisingImpression(String tag){
        this.tag = tag;
    }
    
    @Override
    public String toString(){
        switch(this){
            case UND_MODEL: 
                return "Understood model";
            case ENOUGH_TIME: 
                return "Enough time";
            case SMART_QUESTION:
                return "Smart question";
            case NEVER_HEARD_BACK:
                return "Never heard back";
            case FAST_DECISION:
                return "Fast Decision";
            case PREPARED:
                return "Prepared";
            case RESP_OF_FOUNDER_TIME: 
                return "Respectfull of founder time";
            case ONTIME:
                return "On time";
        }
        return this.tag;
    }
}
