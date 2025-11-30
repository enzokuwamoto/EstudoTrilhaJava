package Kfinalmodifier.test;

import Kfinalmodifier.domain.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.SPEED_LIMIT);
        car.BUYER.setName("Jorgin do Rolo");
        System.out.println(car.BUYER);
    }
}
