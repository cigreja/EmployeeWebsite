
package com.cigreja.employeewebsite.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Test
 * @author Carlos Igreja
 * @since  Feb 22, 2016
 */
@Entity
@Table(name = "Test")
public class Test {

    @Id
    @GeneratedValue
    @Column(name = "Test_ID")
    private int testID;
    
    @Column(name = "First_Name")
    private String firstName;
    
    @Column(name = "Last_Name")
    private String lastName;

    public Test(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
