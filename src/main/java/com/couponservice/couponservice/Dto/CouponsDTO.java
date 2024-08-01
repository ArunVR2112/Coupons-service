package com.couponservice.couponservice.Dto;



import org.bson.types.ObjectId;

import java.math.BigDecimal;

public class CouponsDTO {

    private ObjectId couponid;
    private String code;
    private BigDecimal discount;
    private String expDate;

    public CouponsDTO(ObjectId couponid, String code, BigDecimal discount, String expDate) {
        this.couponid = couponid;
        this.code = code;
        this.discount = discount;
        this.expDate = expDate;
    }

    // Constructors
    public CouponsDTO() {
    }

    public ObjectId getCouponid() {
        return couponid;
    }

    public void setCouponid(ObjectId couponid) {
        this.couponid = couponid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
