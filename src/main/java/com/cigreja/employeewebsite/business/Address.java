
package com.cigreja.employeewebsite.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Address
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "Address_ID")
    //@ManyToMany
    @JoinColumn(name = "Address_ID")
    private int addressID;
    
    @Column(name = "Street_Number")
    private int streetNumber;
    
    @Column(name = "Street_Name")
    private String streetName;
    
    @Column(name = "Street_Type")
    private String streetType;  // Street, Ave,Bld, etc.
    
    @Column(name = "City")
    private String city;
    
    @Column(name = "State")
    private String state;
    
    @Column(name = "Zip")
    private int zip;

    public Address(int streetNumber, String streetName, String streetType, String city, String state, int zip) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.streetType = streetType;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    
    
}
