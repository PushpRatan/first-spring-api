package com.first.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student getStudent(@RequestParam("id") int adminNo){
        return studentRepository.getStudent(adminNo);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public String updateCourse(int adminNo, String course) {

        return studentRepository.updateCourse(adminNo, course);
    }

    public String deleteStudent(int adminNo) {
        return studentRepository.deleteStudent(adminNo);
    }

    public int ageFilter(int age) {
        int total = 0;
        return studentRepository.ageFilter(total, age);

    }
}
