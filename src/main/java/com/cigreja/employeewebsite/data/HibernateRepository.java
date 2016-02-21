
package com.cigreja.employeewebsite.data;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * HibernateRepository
 * @author Carlos Igreja
 * @since  Feb 19, 2016
 */
@Repository
public class HibernateRepository {
    
    SessionFactory sessionFactory;
    
    public HibernateRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    public long count(){
        return findAll().size();
    }
    
    public Object save(Object o){
        Serializable id = currentSession().save(o);
        
        return o; // return new object
    }
    
    public Object findOne(long id){
        return (Object) currentSession().get(Object.class,id);
    }
    
    public Object findByUserName(String username){
        return (Object) currentSession()
                .createCriteria(Object.class)
                .add(Restrictions.eq("username", username))
                .list()
                .get(0);
    }
    
    public List<Object> findAll(){
        return (List<Object>) currentSession().createCriteria(Object.class).list();
    }
}
