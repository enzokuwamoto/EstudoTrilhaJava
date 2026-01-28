package ZZBgenerics.service;

import ZZBgenerics.domain.Car;

import java.util.List;

public class RentalService <T>{
    private List<T> objectsAvailable;

    public RentalService(List<T> carsAvailable) {
        this.objectsAvailable = carsAvailable;
    }

    public T retrieveAvailableObject() {
        System.out.println("Searching for any object available");
        T t = objectsAvailable.remove(0);
        System.out.println("Renting the object:" + t);
        System.out.println("Available object to rent:" + objectsAvailable);
        return t;
    }

    public void returnRentedObject(T t) {
        System.out.println("Returning object: " + t);
        objectsAvailable.add(t);
        System.out.println("Available objects to rent:" + objectsAvailable);
    }
}
