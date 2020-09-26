package com.philencripted.iman.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private ArrayList<Student> students;

    public Department(String deptName){
        this.departmentName = deptName;
        this.students = new ArrayList<>();
    }


    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getAllStudents(){
        return this.students;
    }

    public String getDepartmentName(){
        return this.departmentName;
    }
}
