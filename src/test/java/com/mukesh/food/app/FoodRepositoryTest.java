package com.mukesh.food.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.mukesh.food.app.entities.Food;
import com.mukesh.food.app.repo.FoodRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class FoodRepositoryTest {
	
	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateFood() {
		
		Food food=new Food();
		food.setRestaurantName("star");
		food.setDistributorName("mukesh");
		food.setEmail("mukeshgangwar654@gmail.com");
		food.setAddress("himkarpur");
		food.setPhone(7618660727l);
		food.setPrice(200);
		food.setEnddate("20/10/2021");
		
		Food saveFood = foodRepository.save(food);
		
		Food existFood = entityManager.find(Food.class, saveFood.getId());
		
		//assertThat(existFood.getEmail()).isEqualTo(food.getEmail());
	}

}
