package com.vinsonaiono.QueryParams;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String dojo() {
		return "The dojo is awesome";
	}
	@RequestMapping("/c/{city}")
	public String burbank(@PathVariable("city") String city) {
		return city + " Dojo is located in Southern California";
	}
	@RequestMapping("/s/{sanJose}")
	public String sanJose(@PathVariable("sanJose") String city) {
		return city + " Dojo is the headquarter";
	}
	
}
