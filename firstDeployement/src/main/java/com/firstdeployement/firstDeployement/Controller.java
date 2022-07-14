package com.firstdeployement.firstDeployement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/first")
	public String getData()
	{
		return "hello iam the first deployement project";
	}
	
	@GetMapping("/response")
	 public ResponseEntity<List<String>> getResponse()
	 {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apples");
		fruits.add("mangoes");
		
		
		
		
		return ResponseEntity.ok().header(" "," ").body(fruits);
		
	 }
	
	
	

}
