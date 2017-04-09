
package br.com.glassdolar.model;

import br.com.glassdolar.auxiliar.TagFundraisingImpression;
import br.com.glassdolar.auxiliar.TagInvestmentCriteria;
import br.com.glassdolar.auxiliar.TagNegativeInvestment;
import br.com.glassdolar.auxiliar.TagPositiveInvestment;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Girlian Santos
 */
@Entity
public class Review implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    Double overallRating;
    private boolean investOffer;
    private boolean investimentoAceito;
    private boolean indicateFriend;
    private TagNegativeInvestment tagNegative;
    private TagPositiveInvestment tagPositive;
    private TagInvestmentCriteria tagCriteria;
    private TagFundraisingImpression tagImpression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(Double overallRating) {
        this.overallRating = overallRating;
    }

    public boolean isInvestOffer() {
        return investOffer;
    }

    public void setInvestOffer(boolean investOffer) {
        this.investOffer = investOffer;
    }

    public boolean isInvestimentoAceito() {
        return investimentoAceito;
    }

    public void setInvestimentoAceito(boolean investimentoAceito) {
        this.investimentoAceito = investimentoAceito;
    }

    public TagNegativeInvestment getTagNegative() {
        return tagNegative;
    }

    public void setTagNegative(TagNegativeInvestment tagNegative) {
        this.tagNegative = tagNegative;
    }

    public TagPositiveInvestment getTagPositive() {
        return tagPositive;
    }

    public void setTagPositive(TagPositiveInvestment tagPositive) {
        this.tagPositive = tagPositive;
    }

    public boolean isIndicateFriend() {
        return indicateFriend;
    }

    public void setIndicateFriend(boolean indicateFriend) {
        this.indicateFriend = indicateFriend;
    }

    public TagInvestmentCriteria getTagCriteria() {
        return tagCriteria;
    }

    public void setTagCriteria(TagInvestmentCriteria tagCriteria) {
        this.tagCriteria = tagCriteria;
    }

    public TagFundraisingImpression getTagImpression() {
        return tagImpression;
    }

    public void setTagImpression(TagFundraisingImpression tagImpression) {
        this.tagImpression = tagImpression;
    }
    
   
}
