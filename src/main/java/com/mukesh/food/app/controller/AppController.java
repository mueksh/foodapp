package com.mukesh.food.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.mukesh.food.app.entities.Food;
import com.mukesh.food.app.repo.FoodRepository;
import com.mukesh.food.app.service.SequenceGeneratorService;

@Controller
public class AppController {
	
	@Autowired
	private FoodRepository foodRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	@GetMapping("/add")
	public String addFoodData(Model model) {
		model.addAttribute("food",new Food());
		return "add_files/add";
	}
	
	@GetMapping("/about")
	public String viewAboutPage() {
		
		return "add_files/about";
	}
	
	//processing add food data
		@PostMapping("/process_register")
		public String processData(Food food) {
			food.setId(sequenceGeneratorService.getSequenceNumber(Food.SEQUENCE_NAME));
			foodRepository.save(food);
			return "add_files/success";
			}
		
		@GetMapping("/dishes")
	    public String viewHomePage(Model model) {
	        model.addAttribute("foodList", foodRepository.findAll());
	        return "add_files/dishes";
		}
}


