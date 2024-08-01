package com.couponservice.couponservice.Services;

import com.couponservice.couponservice.Dto.CouponsDTO;
import com.couponservice.couponservice.Models.Coupons;
import org.springframework.stereotype.Service;


@Service
public interface CouponsServices {


    public Coupons createCoupons(Coupons couponsDTO);

    public void deleteCoupons(CouponsDTO couponsDTO);

    public Coupons getCodes(String code);

}
