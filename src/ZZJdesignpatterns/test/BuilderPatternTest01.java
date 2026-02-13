package ZZJdesignpatterns.test;

import ZZJdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Enzo")
                .lastName("Kuwamoto")
                .username("enzokwmt")
                .email("enzokuwamoto@hotmail.com")
                .build();

        System.out.println(person);
    }
}
