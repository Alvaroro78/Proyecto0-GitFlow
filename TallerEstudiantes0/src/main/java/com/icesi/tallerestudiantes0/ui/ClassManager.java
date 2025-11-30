package com.icesi.tallerestudiantes0.ui;


import com.icesi.tallerestudiantes0.model.Class;
import java.util.Scanner;

public class ClassManager {
    public static Scanner sc = new Scanner(System.in);
    public static Class class1 = new Class();

    //Métodos de la ClassManager

    public void getProm(){
        System.out.println("El promedio del curso es de: " + class1.getClassAverage());
    }

    public static void main(String[] args){
        
    }
}
