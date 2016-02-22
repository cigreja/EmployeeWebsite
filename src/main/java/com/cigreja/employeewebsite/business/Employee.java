
package com.cigreja.employeewebsite.business;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Employee
 * @author Carlos Igreja
 * @since  Feb 14, 2016
 */
@Entity
@Table(name = "Employee")
public class Employee extends Person{

    @Id
    @GeneratedValue
    @Column(name = "Employee_ID")
    private int employeeID;
    
    @Column(name = "Salary")
    private double salary;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "Phone")
    private String phone;
    
    @Column(name = "Address_ID")
    //@ManyToMany
    @JoinColumn(name = "Address_ID")
    private int addressID;

    public Employee(String firstName, String lastName, String gender, int age, 
                    Date dateOfBirth, double salary, String email, 
                    String phone) {
        super(firstName, lastName, gender, age, dateOfBirth);
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
  
}
