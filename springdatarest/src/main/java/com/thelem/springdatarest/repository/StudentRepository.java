package com.thelem.springdatarest.repository;

import com.thelem.springdatarest.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
  
}
