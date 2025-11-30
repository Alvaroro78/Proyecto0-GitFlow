package com.icesi.tallerestudiantes0.ui;

import com.icesi.tallerestudiantes0.model.Class;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassManager {
    public static Scanner sc = new Scanner(System.in);
    public static Class class1 = new Class();

    //Métodos de la ClassManager

    public int menu(){
        System.out.println("==========Bienvenido==========");
        System.out.println("1. Ingresar estudiante (debe ingresar el nombre, la edad y su promedio en el curso)");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Calcular promedio del curso");
        System.out.println("4. Salir");
        boolean x=true;
        int option = 0;
        while (x) {
            try {
                option = sc.nextInt();
                sc.nextLine();
                x=false;
            } catch (InputMismatchException e) {
                System.out.println("Opcion incorrecta");
            }
        }
        return option;
    }

    public void getProm(){
        System.out.println("El promedio del curso es de: " + class1.getClassAverage());
    }

    public void addStudent(){
        System.out.println("Ingresar el nombre del estudiante");
        String nombre = sc.nextLine();

        System.out.println("Ingresar la edad del estudiante");
        int edad = 0;
        try {
            edad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: la edad debe ser un número.");
            sc.nextLine(); // limpiar buffer
            return;
        }
        sc.nextLine(); // limpiar el enter

        System.out.println("Ingresar el promedio del estudiante");
        double promedio = 0;

        try {
            promedio = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: el promedio debe ser un número.");
            sc.nextLine(); // ← esto evita el bucle infinito
            return;
        }
        sc.nextLine(); // limpiar enter final

        class1.addStudent(nombre, edad, promedio);

        System.out.println("Estudiante agregado exitosamente.");
    }


    public void showStudents(){
        System.out.println("======ESTUDIANTES======");
        ArrayList<String> info = class1.getStudentsInfo();
        for (int i=0;i<info.size();i++){
            System.out.println(i + ". " + info.get(i));
        }
        System.out.printf("Seleccione el indice del estudiante que desea consultar: ");
        int option = sc.nextInt();
        sc.nextLine();
        try {
            System.out.println(class1.getStudentInfo(option));
        } catch (Exception e) {
            System.out.println("Opcion incorrecta");
        }
    }



    public static void main(String[] args){
        ClassManager cm = new ClassManager();
        boolean x=false;
        do{
            switch (cm.menu()) {
                case 1:
                    cm.addStudent();
                    break;
                case 2:
                    cm.showStudents();
                    break;
                case 3:
                    cm.getProm();
                    break;
                case 4:
                    System.out.println("Muchas gracias!!!");
                    x=true;
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        } while (!x);
    }
}
