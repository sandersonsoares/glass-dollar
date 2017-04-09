/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.dao;

import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.model.Usuario;
import br.com.glassdolar.utils.PersistenceUtil;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marce
 */
public class UsuarioDao extends GenericDaoImpl<Usuario> {
    
    public Usuario getUserByEmailAndPassword(String email, String password) throws DAOException{
        Usuario resultado = null;
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(Usuario.class);
            criteria.add(Restrictions.eq("login", email));
            criteria.add(Restrictions.eq("senha", password));
            resultado = (Usuario) criteria.uniqueResult();
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(e.getMessage());
        }
    }
    
    public Usuario getUserByEmail(String email) throws DAOException{
        Usuario resultado = null;
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(Usuario.class);
            criteria.add(Restrictions.eq("login", email));
            resultado = (Usuario) criteria.uniqueResult();
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(e.getMessage());
        }
    }
}
