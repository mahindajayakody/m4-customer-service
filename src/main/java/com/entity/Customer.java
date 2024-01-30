package com.entity;

public class Customer {
    private String firstName;
    private String midleName;
    private String lsatName;
    private Address mailingAddress;
    private Address billingAddress;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMidleName() {
        return midleName;
    }
    public void setMidleName(String midleName) {
        this.midleName = midleName;
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
    

}
