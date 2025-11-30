package Iinheritance.test;

import Iinheritance.domain.Address;
import Iinheritance.domain.Manager;

public class InheritanceTest02 {
    static void main(String[] args) {
        Address address1 = new Address();
        address1.setStreet("Rua das Couves");
        address1.setZipcode("293109032");
        Manager manager1 = new Manager("Enzo", "101010", address1, 8943, "IT");

        manager1.print();
    }
}
