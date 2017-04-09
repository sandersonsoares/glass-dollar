package br.com.glassdolar.model;

import br.com.glassdolar.auxiliar.ActiveOption;
import br.com.glassdolar.auxiliar.TagFundraisingImpression;
import br.com.glassdolar.auxiliar.TagInvestmentCriteria;
import br.com.glassdolar.auxiliar.TagNegativeInvestment;
import br.com.glassdolar.auxiliar.TagPositiveInvestment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Girlian Santos
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Invester extends Usuario implements Serializable{
          
    private String name;
    @ElementCollection
    private List<String> offices;
    @ElementCollection
    private List<String> geography;
    @ElementCollection
    private List<String>  areas;
    private String logoUrl;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;
    private String companyUrl;
    private ActiveOption activeOption;
    @OneToMany
    private List<Investment> investments;
    @OneToMany(mappedBy = "invester")
    private List<Partner> partners;
    private Double ticketSize;
    private Double mediumTicketSize;

    public Invester(){
        this.reviews = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public List<Partner> getPartners() {
        return partners;
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    public List<String> getLocals() {
        return offices;
    }

    public void setLocals(List<String> locals) {
        this.offices = locals;
    }

    public List<String> getAreas() {
        return areas;
    }

    public void setAreas(List<String> areas) {
        this.areas = areas;
    }

    public ActiveOption getActiveOption() {
        return activeOption;
    }

    public void setActiveOption(ActiveOption activeOption) {
        this.activeOption = activeOption;
    }

    public Double getTicketSize() {
        return ticketSize;
    }

    public void setTicketSize(Double ticketSize) {
        this.ticketSize = ticketSize;
    }

    public Double getMediumTicketSize() {
        return mediumTicketSize;
    }

    public void setMediumTicketSize(Double mediumTicketSize) {
        this.mediumTicketSize = mediumTicketSize;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
    
    

    public Double getOverallRating(){
        Double rating = 0.0;
        for(Review r: this.reviews){
            rating += r.getOverallRating();
        }
        return rating/reviews.size();   
    }    

    public List<String> getOffices() {
        return offices;
    }

    public void setOffices(List<String> offices) {
        this.offices = offices;
    }

    public List<String> getGeography() {
        return geography;
    }

    public void setGeography(List<String> geography) {
        this.geography = geography;
    }
    
    public int indicateToAFriend(){
        int counter = 0;
        for(Review r: reviews){
            if(r.isIndicateFriend())
                counter++;
        }
        return (counter * 100)/reviews.size();
    }
    
    public String investimesCriteria(){
        List<Integer> criteria = new ArrayList();
        for(int i = 0; i < TagInvestmentCriteria.values().length; i++){
            criteria.add(0);
            for(Review r: reviews){
                if(r.getTagCriteria() != null){
                if(r.getTagCriteria().equals(TagInvestmentCriteria.values()[i]))
                    criteria.set(i, criteria.get(i)+1);
            }
            }
        }
        return TagInvestmentCriteria.values()[most(criteria)].tag;
    }
    
    public String negativeInvestment(){
        List<Integer> nInvestments = new ArrayList();
        for(int i = 0; i < TagNegativeInvestment.values().length; i++){
            nInvestments.add(0);
            for(Review r: reviews){
                if(r.getTagNegative()!= null){
                if(r.getTagNegative().equals(TagNegativeInvestment.values()[i]))
                    nInvestments.set(i, nInvestments.get(i)+1);
                }
            }
        }
        return TagNegativeInvestment.values()[most(nInvestments)].tag;
    }
    
    public String positiveInvestment(){
        List<Integer> investments = new ArrayList();
        for(int i = 0; i < TagPositiveInvestment.values().length; i++){
            investments.add(0);
            for(Review r: reviews){
                if(r.getTagPositive()!= null){
                if(r.getTagPositive().equals(TagPositiveInvestment.values()[i]))
                    investments.set(i, investments.get(i)+1);
                }
            }
        }
        return TagPositiveInvestment.values()[most(investments)].tag;
    }
    
    public String fundraisingImpression(){
        List<Integer> fundraising = new ArrayList();
        for(int i = 0; i < TagFundraisingImpression.values().length; i++){
            fundraising.add(0);
            for(Review r: reviews){
                if(r.getTagImpression()!= null){
                if(r.getTagImpression().equals(TagFundraisingImpression.values()[i]))
                    fundraising.set(i, fundraising.get(i)+1);
                }
            }
        }
        return TagFundraisingImpression.values()[most(fundraising)].tag;
    }
    
    private int most(List<Integer> lista){
        int indice = 0;
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) > lista.get(indice))
                indice = i;
        }
        return indice;
    }
}
