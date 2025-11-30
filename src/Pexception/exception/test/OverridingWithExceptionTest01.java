package Pexception.exception.test;

import Pexception.exception.domain.Employee;
import Pexception.exception.domain.LoginInvalidException;
import Pexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionTest01 {
    static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Employee employee = new Employee();
        employee.save();
    }
}
