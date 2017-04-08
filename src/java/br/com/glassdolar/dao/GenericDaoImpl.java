/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glassdolar.dao;

import br.com.glassdolar.exception.DAOException;
import br.com.glassdolar.utils.ExceptionsType;
import br.com.glassdolar.utils.PersistenceUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author marce
 */
public class GenericDaoImpl<T> implements IGenericDao<T> {
    
    private Class classe;

    public GenericDaoImpl() {
        this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    @Override
    public T save(T t) throws DAOException {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            manager.persist(t);
            manager.flush();
            manager.refresh(t);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.INSERT_ERROR), e);
        }
    }
    
    @Override
    public T update(T t) throws DAOException {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            manager.merge(t);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.UPDATE_ERROR), e);
        }
    }

    @Override
    public T remove(T t) throws DAOException {
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            t = manager.merge(t);
            manager.remove(t);
            manager.flush();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.REMOVE_ERROR), e);
        }
    }
    
    @Override
    public T getById(Long id) throws DAOException {
        T resultado = null;
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            Session session = (Session) manager.getDelegate();
            Criteria criteria = session.createCriteria(classe);
            criteria.add(Restrictions.eq("id", id));
            resultado = (T) criteria.uniqueResult();
            return resultado;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.READ_ERROR), e);
        }
    }
    
    @Override
    public List<T> getAll() throws DAOException {
        List<T> resultado = null;
        EntityManager manager = PersistenceUtil.getEntityManager();
        try {
            Query query = manager.createQuery("SELECT * FROM "+classe.getSimpleName(), classe);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DAOException(ExceptionsType.getMessage(ExceptionsType.READ_ERROR), e);
        }
    }
}
