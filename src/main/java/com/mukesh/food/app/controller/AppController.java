package com.mukesh.food.app.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mukesh.food.app.entities.Food;
import com.mukesh.food.app.repo.FoodRepository;

@Controller
public class AppController {
	
	@Autowired
	private FoodRepository foodRepository;
	
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
			foodRepository.save(food);
			return "add_files/success";
			}
		
		@GetMapping("/dishes")
	    public String viewHomePage(Model model) {
	        model.addAttribute("foodList", foodRepository.findAll());
	        return "add_files/dishes";
		}
}

