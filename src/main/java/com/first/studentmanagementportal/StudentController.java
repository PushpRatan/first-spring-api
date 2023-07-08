package com.first.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    // Read Operations
    @GetMapping("/get_info")
    public ResponseEntity getStudent(@RequestParam("id") int adminNo){
        Student s = studentService.getStudent(adminNo);
        if(s == null){
            return new ResponseEntity("Student Not Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(s, HttpStatus.ACCEPTED);
    }


    //Create Operations
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        System.out.println("Check");
        String s= studentService.addStudent(student);
        return new ResponseEntity(s, HttpStatus.CREATED);
    }


    @PutMapping("/put/{id}/{data}")
    public ResponseEntity updateCourse(@PathVariable("id") int adminNo, @PathVariable("data") String course){
        String s =  studentService.updateCourse(adminNo, course);
        return new ResponseEntity(s, HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int adminNo){
        String s = studentService.deleteStudent(adminNo);
        return new ResponseEntity(s, HttpStatus.ACCEPTED);
    }


    @GetMapping("/getage/{age}")
    public ResponseEntity ageFilter(@PathVariable("age") int age){
        int i = studentService.ageFilter(age);
        return new ResponseEntity(i, HttpStatus.ACCEPTED);

    }

}
