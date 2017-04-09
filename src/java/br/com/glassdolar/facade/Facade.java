package br.com.glassdolar.facade;

import br.com.glassdolar.dao.FounderDao;
import br.com.glassdolar.dao.InvesterDao;
import br.com.glassdolar.dao.UsuarioDao;
import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Founder;
import br.com.glassdolar.model.Invester;
import br.com.glassdolar.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Facade implements Serializable {
    
    private InvesterDao investerDao;
    private FounderDao founderDao;
    private UsuarioDao usuarioDao;
    
    public Facade(){
        this.founderDao = new FounderDao();
        this.investerDao = new InvesterDao();
        this.usuarioDao = new UsuarioDao();
    }
    
    public void saveInvester(Invester invester){
        try {
            this.investerDao.save(invester);
        } catch (DAOException e) {
             System.out.println("SAVE INVSTER ERROR");
             e.printStackTrace();
        }
    }
    
    public void saveFounder(Founder founder){
        
        try {
            this.founderDao.save(founder);
        } catch (DAOException e) {
            System.out.println("SAVE FOUNDER ERROR");
            e.printStackTrace();
        }
    }
    
    public void saveUser(Usuario usuario){
        try{
            this.usuarioDao.save(usuario);
        } catch(DAOException e){
            System.out.println("SAVE USER ERROR");
            e.printStackTrace();
        }
    }
    
    public List<Invester> getAllInvestors(){
        try {
            return investerDao.getAll();
        } catch (DAOException e) {
            System.out.println("LIST INVESTORS ERROR");
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    
    public List<Invester> getInvestorByLocal(String local){
        List<Invester> lista = getAllInvestors();
        List<Invester> selected = new ArrayList<>();
        for(Invester i: lista){
            for(String s: i.getOffices()){
                if(s.contains(local))
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
            if(name.contains(i.getName()))
                selected.add(i);
        }
        return selected;
    }
     
      public List<Invester> getInvestorByTicket(Double value){
        List<Invester> lista = getAllInvestors();
        List<Invester> selected = new ArrayList<>();
        for(Invester i: lista){
            if(i.getTicketSize() <= value)
                selected.add(i);
        }
        return selected;
    }
     
}
