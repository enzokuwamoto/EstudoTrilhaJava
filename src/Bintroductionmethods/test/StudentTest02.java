package Bintroductionmethods.test;

import Bintroductionmethods.domain.Student;
import Bintroductionmethods.domain.StudentPrinter;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Enzo";
        student1.age = 19;
        student1.gender = 'M';
        student2.name = "Roberto";
        student2.age = 15;
        student2.gender = 'M';
        // teste do metodo print que está dentro da classe
        student1.print();
        student2.print();
    }
}