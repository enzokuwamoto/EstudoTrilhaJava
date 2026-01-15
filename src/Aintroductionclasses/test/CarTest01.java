package Aintroductionclasses.test;

import Aintroductionclasses.domain.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.marca = "Toyota";
        car1.model = "Corolla Cross";
        car1.year = 2025;

        car2.marca = "Renault";
        car2.model = "Kardian";
        car2.year = 2025;

        System.out.println("Car 1");
        System.out.println(car1.marca);
        System.out.println(car1.model);
        System.out.println(car1.year+"\r\n");
        System.out.println("Car 2");
        System.out.println(car2.marca);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
