package ZZCinnerclasses.test;


import ZZBgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audi")));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(cars);
    }
}
