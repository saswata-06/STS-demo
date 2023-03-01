package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Saswata","Majumdar");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Saswata", "Majumdar"));
        students.add(new Student("Namrata", "Majumdar"));
        students.add(new Student("Sreetama", "Sarkar"));
        return students;
    }

    //RequestParam/QueryParam
    //http://localhost:8080/student/query?firstName=Saswata&lastName=Majumdar
    @GetMapping("/student/query")
    public Student getQueryParam(@RequestParam(name="firstName")String firstName, @RequestParam(name="lastName")String lastName){
        return new Student(firstName,lastName);
    }
}