package br.com.itinerario.controller;

import br.com.itinerario.facade.Facade;
import br.com.itinerario.model.Onibus;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class OnibusBean implements Serializable {

    private Onibus onibus;
    private List<Onibus> onibusList;
    private Facade fachada;

    public OnibusBean() {
        onibus = new Onibus();
    }

    @PostConstruct
    private void init() {
        fachada = new Facade();
        try {
            onibusList = fachada.listarOnibus();
        } catch (Exception ex) {
            Logger.getLogger(OnibusBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvar() {
        try {
            fachada.cadastrarOnibus(onibus);
        } catch (Exception ex) {
            Logger.getLogger(OnibusBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public List<Onibus> getOnibusList() {
        return onibusList;
    }

    public void setOnibusList(List<Onibus> onibusList) {
        this.onibusList = onibusList;
    }
    

}
