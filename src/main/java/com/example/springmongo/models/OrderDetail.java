package com.example.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public class OrderDetail {

    @Id
    private String id;

    @DBRef
    private Collection<Users> userId;

    private BigDecimal total;

    @DBRef
    private Collection<PaymentDetail> paymentId;

    private BigDecimal quantity;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

    public Collection<Users> getUserId() {
        return userId;
    }

    public void setUserId(Collection<Users> userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Collection<PaymentDetail> getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Collection<PaymentDetail> paymentId) {
        this.paymentId = paymentId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
