package com.icesi.tallerestudiantes0.model;

import java.util.ArrayList;

public class Class {
    //Atributes (none)

    //Relationships
    private ArrayList<Student> students;

    //Methods
    public Class(){
        students = new ArrayList<>();
    }


    public void addStudent(){

    }

    public ArrayList<String> getStudentsInfo(){
        return null;
    }

    public double getClassAverage(){
        double prom = 0;
        for (Student student : students){
            prom += student.getGrade();
        }
        return prom/students.size();
    }


}
