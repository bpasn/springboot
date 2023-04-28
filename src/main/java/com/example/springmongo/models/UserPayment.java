package com.example.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Collection;
import java.util.Date;

public class UserPayment {

    @Id
    private String id;

    @DBRef
    private Collection<Users> userId;

    private String paymentType;

    private String provider;

    private Number accountNo;

    private Date expiry;

    public Collection<Users> getUserId() {
        return userId;
    }

    public void setUserId(Collection<Users> userId) {
        this.userId = userId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Number getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Number accountNo) {
        this.accountNo = accountNo;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
