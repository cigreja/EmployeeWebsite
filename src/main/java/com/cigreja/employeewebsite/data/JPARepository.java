
package com.cigreja.employeewebsite.data;

import com.cigreja.employeewebsite.business.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 * JPARepository
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
@Repository
@Transactional
public class JPARepository {
    
//    @PersistenceUnit
//    private EntityManagerFactory entityManagerFactory;
    
    @PersistenceContext
    private EntityManager entityManager;  // thread safe
    
    public void addEmployee(Employee employee){
        entityManager.persist(employee);
    }
    
    public Employee getEmployeeById(int employeeID){
        return entityManager.find(Employee.class, employeeID);
    }
    
    public void saveEmployee(Employee employee){
        entityManager.merge(employee);
    }

}
