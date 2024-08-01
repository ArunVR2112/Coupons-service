package com.couponservice.couponservice.Controllers;

import com.couponservice.couponservice.Dto.CouponsDTO;
import com.couponservice.couponservice.Mapper.CouponMapper;
import com.couponservice.couponservice.Models.Coupons;
import com.couponservice.couponservice.Services.CouponsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class CouponsController {

    @Autowired
    private CouponsServices couponsServices;

    @Autowired
    private CouponMapper couponMapper;

    // Endpoint to save a coupon
    @PostMapping("/save")
    public ResponseEntity<String> saveCoupons(@RequestBody CouponsDTO couponsDTO) {
        Coupons coupons = couponMapper.mapToCoupons(couponsDTO);

        couponsServices.createCoupons(coupons);
        return new ResponseEntity<>("Coupon saved successfully", HttpStatus.CREATED);
    }

    // Endpoint to delete a coupon
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCoupons(@RequestBody CouponsDTO couponsDTO) {
        couponsServices.deleteCoupons(couponsDTO);
        return new ResponseEntity<>("Coupon deleted successfully", HttpStatus.OK);
    }

//     Endpoint to get a coupon by ID
    @GetMapping("/get/{code}")
    public ResponseEntity<CouponsDTO> getCouponById(@PathVariable String code) {
        Coupons coupon = couponsServices.getCodes(code);
        if (coupon != null) {
            CouponsDTO couponsDTO = couponMapper.mapToCouponDTO(coupon);
            return new ResponseEntity<>(couponsDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Add any other endpoints as needed
}
