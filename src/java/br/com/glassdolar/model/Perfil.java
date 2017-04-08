/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author marce
 */
@Entity
public class Perfil implements Serializable {
    
    @Id
    private Long id;
    private String login;
    private String senha;
    private boolean alterarSenhaProxAcesso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAlterarSenhaProxAcesso() {
        return alterarSenhaProxAcesso;
    }

    public void setAlterarSenhaProxAcesso(boolean alterarSenhaProxAcesso) {
        this.alterarSenhaProxAcesso = alterarSenhaProxAcesso;
    }
    
    
    
}
