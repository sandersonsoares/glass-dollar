/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.model;

import br.com.glassdolar.auxiliar.TagPartnerIterator;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Girlian Santos
 */
@Entity
public class Partner implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private Double overalRating;
    private int reviews;
    @ManyToOne
    private Invester invester;
    private String title;
    private String perfilUrl;
    @OneToMany
    private List<TagPartnerIterator> tags;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOveralRating() {
        return overalRating;
    }

    public void setOveralRating(Double overalRating) {
        this.overalRating = overalRating;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public Invester getInvester() {
        return invester;
    }

    public void setInvester(Invester invester) {
        this.invester = invester;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerfilUrl() {
        return perfilUrl;
    }

    public void setPerfilUrl(String perfilUrl) {
        this.perfilUrl = perfilUrl;
    }

    public List<TagPartnerIterator> getTags() {
        return tags;
    }

    public void setTags(List<TagPartnerIterator> tags) {
        this.tags = tags;
    }
}
