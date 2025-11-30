package Bintroductionmethods.test;

import Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Claudio");
        employee1.setAge(77);
        employee1.setSalaries(new double[]{1999,2220,1998});

        employee1.print();
        System.out.println("\n"+employee1.getAverage());
    }
}
