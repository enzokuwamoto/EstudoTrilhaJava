package ZZBgenerics.service;
import ZZBgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> BoatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));

    public Boat retrieveAvailableBoat() {
        System.out.println("Searching for any Boat available");
        Boat Boat = BoatsAvailable.remove(0);
        System.out.println("Renting the Boat:" + Boat);
        System.out.println("Available Boats to rent:" + BoatsAvailable);
        return Boat;
    }

    public void returnRentedBoat(Boat Boat) {
        System.out.println("Returning Boat: " + Boat);
        BoatsAvailable.add(Boat);
        System.out.println("Available Boats to rent:" + BoatsAvailable);
    }
}
