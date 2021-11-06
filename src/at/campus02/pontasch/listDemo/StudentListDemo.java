package at.campus02.pontasch.listDemo;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Pontasch");
        students.add("Huber");
        students.add("Schlacher");
        students.add("Max");
        students.add("Fall");
        students.add(new String("Hans"));



        for (String student: students){

            System.out.println("Student  " + student);

            if (student.contains("Pontasch")){
                System.out.println("Pontasch ist in der Liste");
            }

        }
        printStudents(students); //ruft die Methode auf
    }
    public static void printStudents(ArrayList<String> studentList){


        System.out.println("--------");
        for (String student: studentList){
            System.out.println("Student " + student);
         //   System.out.println("--------");
        }
        System.out.println("--------");
    }
}
