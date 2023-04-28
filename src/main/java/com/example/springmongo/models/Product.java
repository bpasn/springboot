package com.example.springmongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TimeSeries;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

@Document("products")

public class Product {
    @Id
    private Long id;

    private String name;

    private String desc;

    //SKU (Stock Keeping Unit)
    // คือ หน่วยสินค้าที่เล็กที่สุดในระบบคลังสินค้า ที่ถูกจำแนกออกตามความแตกต่างใน 1 รหัสสินค้า
    // ด้วย สี, ขนาด, น้ำหนัก, ความกว้าง, ความยาว, รสชาติ, ยี่ห้อ, รุ่น เป็นต้น
    private String SKU;


    @DBRef
    private Collection<ProductCategory> categoryId;

    @DBRef
    private Collection<ProductInventory> inventoryId;

    private BigDecimal price;

    @DBRef
    private Collection<Discount> discountId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date deletedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Collection<ProductCategory> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Collection<ProductCategory> categoryId) {
        this.categoryId = categoryId;
    }

    public Collection<ProductInventory> getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Collection<ProductInventory> inventoryId) {
        this.inventoryId = inventoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Collection<Discount> getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Collection<Discount> discountId) {
        this.discountId = discountId;
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

