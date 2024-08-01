package com.couponservice.couponservice.Mapper;

import com.couponservice.couponservice.Dto.CouponsDTO;
import com.couponservice.couponservice.Models.Coupons;
import org.springframework.stereotype.Component;

@Component
public class CouponMapper {

    // Convert Coupons entity to CouponsDTO
    public CouponsDTO mapToCouponDTO(Coupons coupon) {
        if (coupon == null) {
            return null;
        }
        return new CouponsDTO(
                coupon.getId(), // Ensure this matches the field in Coupons
                coupon.getCode(),
                coupon.getDiscount(),
                coupon.getExpDate() // Ensure this matches the field in Coupons
        );
    }

    // Convert CouponsDTO to Coupons entity
    public Coupons mapToCoupons(CouponsDTO couponDTO) {
        if (couponDTO == null) {
            return null;
        }
        Coupons coupon = new Coupons();

        coupon.setCode(couponDTO.getCode());
        coupon.setDiscount(couponDTO.getDiscount());
        coupon.setExpDate(couponDTO.getExpDate()); // Ensure this matches the field in Coupons
        return coupon;
    }
}
