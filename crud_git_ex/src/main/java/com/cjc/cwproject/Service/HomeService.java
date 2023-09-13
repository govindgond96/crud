package com.cjc.cwproject.Service;

import java.util.List;

import com.cjc.cwproject.Model.Student;

public interface HomeService {

	Student savestu(Student s);

	List<Student> getallstu();

}
