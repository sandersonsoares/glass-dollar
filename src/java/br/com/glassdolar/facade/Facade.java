package br.com.glassdolar.facade;

import br.com.glassdolar.dao.FounderDao;
import br.com.glassdolar.dao.InvesterDao;
import br.com.glassdolar.dao.PerfilDao;
import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Perfil;
import java.io.Serializable;


public class Facade implements Serializable {
    
    private InvesterDao investerDao;
    private FounderDao founderDao;
    private PerfilDao perfilDao;
    
    public Facade(){
        this.founderDao = new FounderDao();
        this.investerDao = new InvesterDao();
        this.perfilDao = new PerfilDao();
    }
    
    public void saveInvester(Invester invester){
        try {
            this.investerDao.save(invester);
        } catch (DAOException e) {
             System.out.println("SAVE ERROR INVSTER!");
             e.printStackTrace();
        }
    }
    
    public void saveFounder(Founder founder){
        
        try {
            this.founderDao.save(founder);
        } catch (DAOException e) {
            System.out.println("SAVE ERROR FOUNDER");
            e.printStackTrace();
        }
    }
    
    public void savePerfil(Perfil perfil){
        try{
            this.perfilDao.save(perfil);
        } catch(DAOException e){
            System.out.println("SAVE ERROR PERFIL!");
            e.printStackTrace();
        }
    }
}
