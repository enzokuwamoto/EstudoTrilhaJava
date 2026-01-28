package ZZBgenerics.test;

import ZZBgenerics.domain.Boat;
import ZZBgenerics.domain.Car;
import ZZBgenerics.service.BoatRentalService;
import ZZBgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClasses03 {
    static void main(String[] args) {
         List<Boat> BoatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
         List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));

        RentalService<Car> rentalServiceCar = new RentalService<>(carsAvailable);
        Car car = rentalServiceCar.retrieveAvailableObject();
        System.out.println("Using car for a month");
        rentalServiceCar.returnRentedObject(car);

        RentalService<Boat> rentalServiceBoat = new RentalService<>(BoatsAvailable);
        Boat boat = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Using car for a month");
        rentalServiceBoat.returnRentedObject(boat);
    }
}
