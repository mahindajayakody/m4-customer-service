package com.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;
    private String middleName;
    private String lsatName;
    private Address mailingAddress;
    private Address billingAddress;

    protected Customer(){}
    public Customer(String firstName,String lsatName){
        this.setFirstName(firstName); 
        this.setLsatName(lsatName);
    }

    public Long getId() {
        return id;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMidleName() {
        return middleName;
    }
    public void setMidleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLsatName() {
        return lsatName;
    }
    public void setLsatName(String lsatName) {
        this.lsatName = lsatName;
    }
    public Address getMailingAddress() {
        return mailingAddress;
    }
    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString(){
        return String.format("Customer [id=%d ,firstName = %s,lastName=%s]",this.id,this.firstName,this.lsatName);
    }
    

}
