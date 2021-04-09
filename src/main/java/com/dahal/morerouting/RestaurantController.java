package com.dahal.morerouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestaurantController {
	
	@RequestMapping("/{wordInput}")
	public String showLocation(@PathVariable("wordInput") String wordInput ) {
		System.out.println(wordInput);
		if(wordInput.equals("restaurant")) {
			return "You tryna find a restraurant thooo";
		}else if (wordInput.equals("silver-diner")){
			return "Uggghhhhh....couldn't find a better option?";
		}else if (wordInput.equals("bangkok-garden")) {
			return "best thai food in bethesda md";
		}else {
			return "Sorry the restaurant you are looking for is not available";
		}
	}
	
	
	@RequestMapping("/find")
    public String index(@RequestParam(value="term") String searchQuery,
    		@RequestParam(value="location") String locationInput
    		) {
		
		System.out.println("Search query is: "+ searchQuery);
		System.out.printf("Location Input is: %s", locationInput);
		System.out.printf("\nLocation Input is: %s", locationInput);
        return "You searched for: " + searchQuery;
    }
//	
//	@RequestMapping("/find")
//	  public String findFlight(@RequestParam("origin") String origin
//	                          , @RequestParam("destination") String destination,....
	
	

}
