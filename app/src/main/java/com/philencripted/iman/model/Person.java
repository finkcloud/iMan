package com.philencripted.iman.model;

import java.io.Serializable;

public class Person implements Serializable {
    protected String fullName;
    protected int age;

    public Person(String fullname, int age){
        this.fullName = fullname;
        this.age = age;
    }

    public String getFullName(){
        return this.fullName;
    }


    public int getAge(){
        return this.age;
    }
}
