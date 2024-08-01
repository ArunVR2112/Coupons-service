package com.couponservice.couponservice.Repository;


import com.couponservice.couponservice.Models.Coupons;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CopounsRepository extends MongoRepository<Coupons, ObjectId> {


    Coupons getCode(String code);

}
