package com.philencripted.iman.model;

import java.util.ArrayList;
import java.util.List;

public class Institution {
    String institutionName;
    private List<Department> departments;


    public Institution(String name){
        this.institutionName = name;
        this.departments = new ArrayList<>();
    }


    // craete a new student for this inst
    public Student createNewStudent(String fullname, int age, String regNo, String phone){
        return new Student(fullname, age, regNo, phone);
    }

    // create a new dept for this inst
    public Department createNewDepartment(String deptName){
        Department dept =  new Department(deptName);
        addDeptToList(dept);
        return dept;
    }



    // add the created dept to list
    private void addDeptToList(Department dept){
        this.departments.add(dept);
    }


    // get all departments for this inst
    public List<Department> getAllDepartments(){
        return this.departments;
    }



}
