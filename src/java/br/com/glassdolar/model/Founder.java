package br.com.glassdolar.model;

import java.io.Serializable;
import java.util.List;
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
public class Founder extends Usuario implements Serializable{
    
    private String name;
    private String email;
    private String descricao;
    private String companyURL;
    @OneToMany
    private List<Invester> investorsOverview;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public List<Invester> getInvestorsOverview() {
        return investorsOverview;
    }

    public void setInvestorsOverview(List<Invester> investorsOverview) {
        this.investorsOverview = investorsOverview;
    }
    
}

