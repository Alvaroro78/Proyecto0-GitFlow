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

    /*
     */

    public void addStudent(String name,int age, double grade){
        students.add(new Student(name, age, grade));
    }

    public ArrayList<String> getStudentsInfo(){
        ArrayList<String> studentsInfo = new ArrayList<>();
        for (Student student : students){
            studentsInfo.add(student.toString());
        }
        return studentsInfo;
    }

    public String getStudentInfo(int index) throws Exception{
        try {
            return students.get(index).getName() + " " + students.get(index).getAge() + " " + students.get(index).getGrade();
        } catch (IndexOutOfBoundsException e) {
            throw new Exception();
        }
    }

    public double getClassAverage(){
        double prom = 0;
        for (Student student : students){
            prom += student.getGrade();
        }
        return prom/students.size();
    }
}