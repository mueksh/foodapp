package com.mukesh.food.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mukesh.food.app.entities.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{

}
