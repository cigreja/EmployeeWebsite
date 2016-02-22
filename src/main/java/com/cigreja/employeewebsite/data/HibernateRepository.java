
package com.cigreja.employeewebsite.data;

import com.cigreja.employeewebsite.business.Employee;
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
    
    public Employee save(Employee employee){
        Serializable id = currentSession().save(employee);
        
        return employee; // return new object
    }
    
    public Employee findOne(int id){
        return (Employee) currentSession().get(Employee.class,id);
    }
    
    public Employee findByFirstName(String firstName){
        return (Employee) currentSession()
                .createCriteria(Object.class)
                .add(Restrictions.eq("username", firstName))
                .list()
                .get(0);
    }
    
    public List<Employee> findAll(){
        return (List<Employee>) currentSession().createCriteria(Employee.class).list();
    }
}
