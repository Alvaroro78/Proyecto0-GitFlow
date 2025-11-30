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
        ArrayList<String> studentsInfo = new ArrayList<>();
        for (Student student : students){
            studentsInfo.add(student.toString());
        }
        return studentsInfo;
    }

    public String getStudentInfo(int index){
        return students.get(index).getName() + " " +  students.get(index).getAge() + " " + students.get(index).getGrade();
    }

    public double getClassAverage(){
        return 0;
    }


}
