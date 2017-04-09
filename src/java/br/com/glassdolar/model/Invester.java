package br.com.glassdolar.model;

import br.com.glassdolar.auxiliar.ActiveOption;
import java.io.Serializable;
import java.util.List;
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
    private List<String> locals;
    @ElementCollection
    private List<String>  areas;
    private String logoUrl;
    private String companyUrl;
    private ActiveOption activeOption;
    @OneToMany
    private List<Investment> investments;
    @OneToMany(mappedBy = "invester")
    private List<Partner> partners;
    private Double ticketSize;
    private Double mediumTicketSize;

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
        return locals;
    }

    public void setLocals(List<String> locals) {
        this.locals = locals;
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
    
    
    
}
