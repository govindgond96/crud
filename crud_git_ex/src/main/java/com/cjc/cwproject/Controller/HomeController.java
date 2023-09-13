package com.cjc.cwproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.cwproject.Model.Student;
import com.cjc.cwproject.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	
	HomeService hs ;
	
	
	@PostMapping("/savestu")
	public ResponseEntity<Student> savestu(@RequestBody Student s){
		
		Student st = hs.savestu(s);
		
		return new ResponseEntity<Student>(st, HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getallstu")
	public ResponseEntity<List< Student>> getstu(){
		
		List< Student> stu = hs.getallstu();
		
		return new ResponseEntity <List< Student>>(stu, HttpStatus.OK);
		
		
	}
}
