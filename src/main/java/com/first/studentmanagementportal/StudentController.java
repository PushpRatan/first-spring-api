package com.first.studentmanagementportal;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    Map<Integer, Student> studentsDB = new HashMap<>();


    // Read Operations
    @GetMapping("/get_info")
    public Student getStudent(@RequestParam("id") int adminNo){
        if(studentsDB.containsKey(adminNo)){
            return studentsDB.get(adminNo);
        }else{
            System.out.println("No such student exists");
        }
        return null;
    }

    @GetMapping("/get/{id}")
    public Student getStudentByPath(@PathVariable("id") int adminNo){
        if(studentsDB.containsKey(adminNo)){
            return studentsDB.get(adminNo);
        }else{
            System.out.println("No such student exists");
        }
        return null;
    }


    //Create Operations
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        try{
            studentsDB.put(student.getAdminNo(), student);
            return "Student added successfully";
        }catch (Exception e){
            return "Received an error";
        }
    }


    @PutMapping("/put/{id}/{data}")
    public String updateCourse(@PathVariable("id") int adminNo, @PathVariable("data") String course){
        if(studentsDB.containsKey(adminNo)){
            Student student = studentsDB.get(adminNo);
            student.setCourse(course);
            return "Data updated successfully";
        }
        return "No data found";
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int adminNo){
        if(studentsDB.containsKey(adminNo)){
            studentsDB.remove(adminNo);
            return "Student Deleted";
        }
        return "No data found";
    }



}
