package com.example.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;

public class OrderItem {

    @Id
    private String id;

    @DBRef
    private Collection<OrderDetail> orderId;

    @DBRef
    private Collection<Product> productId;

    private Number quantity;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date deletedAt;

    public Collection<OrderDetail> getOrderId() {
        return orderId;
    }

    public void setOrderId(Collection<OrderDetail> orderId) {
        this.orderId = orderId;
    }

    public Collection<Product> getProductId() {
        return productId;
    }

    public void setProductId(Collection<Product> productId) {
        this.productId = productId;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
