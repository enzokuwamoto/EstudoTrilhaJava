package Iinheritance.test;

import Iinheritance.domain.Address;
import Iinheritance.domain.Employee;
import Iinheritance.domain.Manager;

public class InheritanceTest01 {
    static void main(String[] args) {
        Address address1 = new Address();
        address1.setStreet("12th Avenue");
        address1.setZipcode("13245");
        Employee employee1 = new Employee("Ronaldo","121212", address1, 5784);
        Manager manager1 = new Manager("Cleber", "120238", address1, 14928, "IT" );

        employee1.print();
        manager1.print();
    }
}
