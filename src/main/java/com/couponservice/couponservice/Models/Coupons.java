package com.couponservice.couponservice.Models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupons {

    @Id
    private ObjectId id; // Change this to String to let MongoDB auto-generate IDs

    private String code;
    private BigDecimal discount;
    private String expDate;
}
