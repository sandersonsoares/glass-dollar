/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.dao;

import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Usuario;
import br.com.glassdolar.utils.PersistenceUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author marce
 */
public class UsuarioDao extends GenericDaoImpl<Usuario> {
    
    public Usuario getUserByEmailAndPassword(String email, String password) throws DAOException{
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            Query query = manager.createNativeQuery("SELECT * FROM usuario WHERE login = :email AND senha = :password", Usuario.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            List<Usuario> users = query.getResultList();
            if(users != null && users.size()>0){
                return users.get(0);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(e.getMessage());
        }
    }
}
