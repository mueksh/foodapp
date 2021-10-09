package com.mukesh.food.app.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mukesh.food.app.entities.Food;

@Repository
public interface FoodRepository extends MongoRepository<Food, Integer>{

}
