package com.icesi.tallerestudiantes0.model;

public class Student {
    //Atributes
    private String name;
    private int age;
    private double grade;

    //Relationships (none)

    //Methods

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "";
    }
}
