package com.icesi.tallerestudiantes0.model;

import java.util.ArrayList;

public class Class {
    //Atributes (none)

    //Relationships
    private ArrayList<Student> students;

    //Methods
    public Class(){

    }

    /*
     */

    public void addStudent(String name,int age, double grade){
        try {
            students.add(new Student(name, age, grade));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> getStudentsInfo(){
        return null;
    }

    public double getClassAverage(){
        return 0;
    }


}
