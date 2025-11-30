package Hassociationexercise.test;

import Hassociationexercise.domain.Place;
import Hassociationexercise.domain.Professor;
import Hassociationexercise.domain.Seminar;
import Hassociationexercise.domain.Student;

public class UniversityTest01 {
    static void main(String[] args) {
        Place place1 = new Place("Mogi das Cruzes");
        Student student1 = new Student("Enzo", 19);
        Student student2 = new Student("Claudio", 27);
        Student[] studentsSeminarB = {student1};
        Student[] studentsSeminarA = {student2};
        Seminar seminara = new Seminar("TI", studentsSeminarA, place1); //falta students
        Seminar seminarb = new Seminar("Logistics", studentsSeminarB, place1); //falta students
        Seminar[] availableSeminars = {seminara, seminarb};
        Professor professor1 = new Professor("Douglas","IT", availableSeminars);

        professor1.print();
        student1.print();
    }
}
