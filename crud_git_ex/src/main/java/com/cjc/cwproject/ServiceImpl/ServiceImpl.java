package com.cjc.cwproject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.cwproject.Model.Student;
import com.cjc.cwproject.Repository.HomeRepository;
import com.cjc.cwproject.Service.HomeService;

@Service
public class ServiceImpl implements HomeService{

	@Autowired
	
	HomeRepository hr ;
	
	@Override
	public Student savestu(Student s) {
		
		return hr.save(s);
	}

	@Override
	public List<Student> getallstu() {
		
		return (List<Student>) hr.findAll();
	}

}
