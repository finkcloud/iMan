package com.philencripted.iman.model;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String regNo;
    private String phoneNo;

    public Student(String fullname, int age, String regNo, String phone){
        super(fullname,age);
        this.regNo = regNo;
        this.phoneNo = phone;
    }

    public Student(){
        super(null, 0);
    }





    public String getFullName(){
        return super.fullName;
    }

    public int getAge(){
        return super.age;
    }

    public String getRegNo(){
        return this.regNo;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
