package com.thelem.springdatarest.entity;

import com.thelem.springdatarest.repository.StudentRepository;
import com.thelem.springdatarest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public abstract class DatabaseLoader implements CommandLineRunner {

   private StudentRepository studentRepository;

   @Autowired
   public DatabaseLoader(StudentRepository studentRepository) {
       this.studentRepository = studentRepository;
   }

   @Override
   public void run(String... strings) throws Exception {
       this.studentRepository.save(new Student("bartes", "baganini", "M.sc.2 student"));
   }
}
