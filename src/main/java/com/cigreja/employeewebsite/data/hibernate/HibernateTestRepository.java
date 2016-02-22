
package com.cigreja.employeewebsite.data.hibernate;

import com.cigreja.employeewebsite.business.Employee;
import com.cigreja.employeewebsite.business.Test;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * HibernateTestRepository
 * @author Carlos Igreja
 * @since  Feb 22, 2016
 */
@Repository
public class HibernateTestRepository {

    SessionFactory sessionFactory;
    
    @Autowired
    public HibernateTestRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    
    public long count(){
        return findAll().size();
    }
    
    public Test save(Test test){
        Serializable id = currentSession().save(test);
        
        return test; // return new object
    }
    
    public Test findOne(int id){
        return (Test) currentSession().get(Test.class,id);
    }
    
    public Test findByFirstName(String firstName){
        return (Test) currentSession()
                .createCriteria(Test.class)
                .add(Restrictions.eq("firstName", firstName))
                .list()
                .get(0);
    }
    
    public List<Employee> findAll(){
        return (List<Employee>) currentSession().createCriteria(Test.class).list();
    }
}
