package com.cigreja.employeewebsite.data.springdata;

import com.cigreja.employeewebsite.business.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ISpringDataRepository
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
public interface ISpringDataRepository extends JpaRepository<Employee,Integer>{
    
    Employee findByEmployeeID(int employeeID);
    Employee findByEmail(String email);
}
