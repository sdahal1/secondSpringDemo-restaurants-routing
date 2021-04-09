package com.dahal.morerouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/menu")
public class FoodController {
	@RequestMapping("")
	public String hello() {
		return "All the food items will be here one day";
	}
	
	@RequestMapping("/breakfast")
	public String getBreakfast() {
		return "Ima scramble them grass-fed free range antibiotic free granola and eggs!";
	}
	
	
	
	

	
	
	

}
