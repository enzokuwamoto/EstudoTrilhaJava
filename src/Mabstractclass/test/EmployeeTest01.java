package Mabstractclass.test;

import Mabstractclass.domain.Developer;
import Mabstractclass.domain.Employee;
import Mabstractclass.domain.Manager;

public class EmployeeTest01 {
    static void main(String[] args) {
        Manager manager = new Manager("Carlos", 15000);
        Developer developer = new Developer("Robertinho do Java", 8000);
        developer.calculateBonusSalary();
        manager.calculateBonusSalary();
        System.out.println(manager);
        System.out.println(developer);
    }
}
