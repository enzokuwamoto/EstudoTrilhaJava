package ZZBgenerics.test;

import ZZBgenerics.domain.Car;
import ZZBgenerics.service.CarRentalService;

public class GenericClasses01 {
    static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailableCar();
        System.out.println("Using the car for an entire month");
        carRentalService.returnRentedCar(car);
    }
}
