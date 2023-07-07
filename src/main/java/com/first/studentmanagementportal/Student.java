package com.first.studentmanagementportal;

public class Student {
    private int adminNo;
    private String name;
    private int age;
    private String course;

    public Student(int adminNo, String name, int age, String course) {
        this.adminNo = adminNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "adminNo=" + adminNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Course='" + course + '\'' +
                '}';
    }
}
