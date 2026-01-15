package Bintroductionmethods.test;

import Bintroductionmethods.domain.Student;
import Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student1.name = "Enzo";
        student1.age = 19;
        student1.gender = 'M';
        student2.name = "Roberto";
        student2.age = 15;
        student2.gender = 'M';

        System.out.println("Student 1");
        printer.print(student1);
        System.out.println("Student 2");
        printer.print(student2);
    }
}
