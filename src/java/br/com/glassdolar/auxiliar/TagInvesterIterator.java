/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.auxiliar;

import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Partner;
import java.io.Serializable;
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
public class TagInvesterIterator implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private TagInvester tag;
    private int value;
    
    @ManyToOne
    private Invester invester;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TagInvester getTag() {
        return tag;
    }

    public void setTag(TagInvester tag) {
        this.tag = tag;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Invester getInvester() {
        return invester;
    }

    public void setInvester(Invester invester) {
        this.invester = invester;
    }
    
    
}
