package com.example.mylib;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public Student(String str){
        this.name = str;
    }
}
