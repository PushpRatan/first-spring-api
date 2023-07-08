package com.first.studentmanagementportal;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {
    Map<Integer, Student> studentsDB = new HashMap<>();

    public Student getStudent(int adminNo){
        return studentsDB.get(adminNo);
    }

    public String addStudent(Student student) {
        if(studentsDB.containsKey(student.getAdminNo())){
            return "Student already present";
        }
        studentsDB.put(student.getAdminNo(), student);
        return "Studemt added Successfully";
    }

    public String updateCourse(int adminNo, String course) {
        if(studentsDB.containsKey(adminNo)){
            Student student = studentsDB.get(adminNo);
            student.setCourse(course);
            return "Data updated successfully";
        }
        return "No data found";
    }

    public String deleteStudent(int adminNo) {
        if(studentsDB.containsKey(adminNo)){
            studentsDB.remove(adminNo);
            return "Student Deleted";
        }
        return "No data found";
    }

    public int ageFilter(int total, int age) {
        for(int adminNo : studentsDB.keySet()){
            if(studentsDB.get(adminNo).getAge()<age){
                total++;
            }
        }
        return total;
    }
}
