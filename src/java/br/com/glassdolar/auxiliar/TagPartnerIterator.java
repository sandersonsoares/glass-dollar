/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.auxiliar;

import br.com.glassdolar.model.Partner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Girlian Santos
 */
@Entity
public class TagPartnerIterator{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private TagPartners tag;
    private int value;
    
    @ManyToOne
    private Partner partner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TagPartners getTag() {
        return tag;
    }

    public void setTag(TagPartners tag) {
        this.tag = tag;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }
    
    
    
}
