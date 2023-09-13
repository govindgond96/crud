package com.cjc.cwproject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.cwproject.Model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

}
