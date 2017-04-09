package br.com.glassdolar.facade;

import br.com.glassdolar.dao.FounderDao;
import br.com.glassdolar.dao.InvesterDao;
import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    public List<Invester> getAllInvestors(){
        try {
            return investerDao.getAll();
        } catch (DAOException ex) {
            System.out.println("erro ao buscar todos os investidores");
            System.out.println(ex.getMessage());
        }
        return new ArrayList<>();
    }
    
    public List<Invester> getInvestorByLocal(String local){
        List<Invester> lista = getAllInvestors();
        List<Invester> selected = new ArrayList<>();
        for(Invester i: lista){
            for(String s: i.getLocals()){
                if(s.equals(local))
                    selected.add(i);
            }
        }
        return selected;
    }
    
     public List<Invester> getInvestorByArea(String area){
        List<Invester> lista = getAllInvestors();
        List<Invester> selected = new ArrayList<>();
        for(Invester i: lista){
            for(String s: i.getAreas()){
                if(s.equals(area))
                    selected.add(i);
            }
        }
        return selected;
    }
     
     public List<Invester> getInvestorByName(String name){
        List<Invester> lista = getAllInvestors();
        List<Invester> selected = new ArrayList<>();
        for(Invester i: lista){
            if(name.equals(i.getName()))
                selected.add(i);
        }
        return selected;
    }
     
}
