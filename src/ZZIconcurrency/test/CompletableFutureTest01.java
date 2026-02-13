package ZZIconcurrency.test;

import ZZIconcurrency.service.StoreService;

public class CompletableFutureTest01 {
    static void main(String[] args) {
        StoreService storeService = new StoreService();
    }
    private static void searchPricesSync(StoreService service){
        long start = System.currentTimeMillis();
        System.out.println(service.getPricesSync("Store 1"));
        System.out.println(service.getPricesSync("Store 2"));
        System.out.println(service.getPricesSync("Store 3"));
        System.out.println(service.getPricesSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %ds%n", (end-start));
    }
}
