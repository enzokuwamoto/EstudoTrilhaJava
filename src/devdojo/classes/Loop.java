package devdojo.classes;

public class Loop {
    static void main() {
        // loops - while, do while, for
        int counter = 10;

        while (counter < 11) {
            System.out.println(counter);
            counter++;
        }
        do {
            System.out.println("Inside loop");
        } while (counter > 20);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        // break
        for (int i = 0; i < 50; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
        }
        // exercise
        double car_price = 25000;
//        for (int monthCount = 1; monthCount <= car_price; monthCount++) {
//            double monthlyPrice = car_price / monthCount;
//            if (monthlyPrice >= 1000){
//                System.out.println("Months:"+monthCount+" Price:"+monthlyPrice);
//            } else {
//                break;
//            }
//        }

//         continue
        for (double monthCount = car_price; monthCount >= 1; monthCount--) {
            double monthlyPrice = car_price / monthCount;
            if (monthlyPrice < 1000) {
                continue;
            }
            System.out.println("Months:" + monthCount + " Price:" + monthlyPrice);
        }
    }

}
