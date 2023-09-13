package com.cjc.cwproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/getsingleuser/{sid}")
public ResponseEntity<Student> getsingleuser(@PathVariable("sid") int id) {
		
		Student singleid=hs.getsinglestu(id);
		
		
		return new ResponseEntity<Student>(singleid, HttpStatus.OK);
	}
	@PutMapping("/updateUser")
	public ResponseEntity<Student> updateuser(@RequestBody Student us){
		
		Student st = hs.savestu(us);
		
		return new ResponseEntity<Student>(st, HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<String> Deletedata(@PathVariable ("sid")int id){
	  hs.Deletedata(id);

	  return new ResponseEntity<String>("delete user",HttpStatus.OK);

	}
}
