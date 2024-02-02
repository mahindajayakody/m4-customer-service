package com.m4.customer.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "customer")
public class Customer {

    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lsatName")
    private String lsatName;
    @JsonProperty("mailingAddress")
    private Address mailingAddress;
    @JsonProperty("billingAddress")
    private Address billingAddress;

    protected Customer() {
    }

    public Customer(String firstName, String lsatName) {
        this.setFirstName(firstName);
        this.setLsatName(lsatName);
    }

    public String getId() {
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
    public String toString() {
        return String.format("Customer [id=%d ,firstName = %s,lastName=%s]", this.id, this.firstName, this.lsatName);
    }

}
