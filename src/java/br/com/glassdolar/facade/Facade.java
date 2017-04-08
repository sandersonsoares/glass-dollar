package br.com.glassdolar.facade;

import br.com.glassdolar.dao.FounderDao;
import br.com.glassdolar.dao.InvesterDao;
import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import java.io.Serializable;


public class Facade implements Serializable {
    
    private InvesterDao investerDao;
    private FounderDao founderDao;
    
    public Facade(){
        this.founderDao = new FounderDao();
        this.investerDao = new InvesterDao();
    }
    
    public void saveInvester(Invester invester){
        try {
            this.investerDao.save(invester);
        } catch (DAOException ex) {
             System.out.println("ERRO AO SALVAR INVESTIDOR!");
             System.out.println(ex.getMessage());
        }
    }
    
    public void saveFounder(Founder founder){
        
        try {
            this.founderDao.save(founder);
        } catch (DAOException e) {
            System.out.println("ERRO AO SALVAR PARTNER");
            System.out.println(e.getMessage());
        }
    }
    
}
