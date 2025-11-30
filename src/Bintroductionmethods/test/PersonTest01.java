package Bintroductionmethods.test;

import Bintroductionmethods.domain.Person;

public class PersonTest01 {
    static void main(String[] args) {
        Person person = new Person();
//        person.name = "Enzo";
//        person.age = 19;
        person.setName("Enzo");
        person.setAge(-2);
//        person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
