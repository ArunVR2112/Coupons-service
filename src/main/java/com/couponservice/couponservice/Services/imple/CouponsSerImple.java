package com.couponservice.couponservice.Services.imple;

import com.couponservice.couponservice.Dto.CouponsDTO;
import com.couponservice.couponservice.Models.Coupons;
import com.couponservice.couponservice.Repository.CopounsRepository;
import com.couponservice.couponservice.Services.CouponsServices;
import com.couponservice.couponservice.Mapper.CouponMapper; // Import your mapper
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;

@Service
public class CouponsSerImple implements CouponsServices {

    @Autowired
    private CopounsRepository copRepository;

    @Autowired
    private CouponMapper couponMapper; // Inject the mapper

    @Override
    @Transactional
    public Coupons createCoupons(Coupons couponsDTO) {
        System.out.println(couponsDTO.getId());

        return copRepository.save(couponsDTO);
    }

    @Override
    @Transactional
    public void deleteCoupons(CouponsDTO couponsDTO) {
        Coupons coupon = couponMapper.mapToCoupons(couponsDTO);
        copRepository.delete(coupon);
    }

    @Override
    public Coupons getCodes(String code) {

        return copRepository.getCode(code);
    }
}
