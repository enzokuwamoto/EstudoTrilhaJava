package ZZBgenerics.test;

import ZZBgenerics.domain.Boat;
import ZZBgenerics.service.BoatRentalService;

public class GenericClasses02 {
    static void main(String[] args) {
        BoatRentalService BoatRentalService = new BoatRentalService();
        Boat Boat = BoatRentalService.retrieveAvailableBoat();
        System.out.println("Using the Boat for an entire month");
        BoatRentalService.returnRentedBoat(Boat);
    }
}
