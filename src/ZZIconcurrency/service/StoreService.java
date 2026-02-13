package ZZIconcurrency.service;

import java.util.concurrent.*;

public class StoreService {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPricesSync(String storeName) {
        System.out.printf("Getting prices sync for store %n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesFutureAsync(String storeName) {
        System.out.printf("Getting prices sync for store %n", storeName);
        return ex.submit(this::priceGenerator);
    }

    private double priceGenerator() {
        System.out.printf("% generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private static void searchPricesFutureAsync(StoreService service) {
        long start = System.currentTimeMillis();
        Future<Double> pricesFutureAsync1 = service.getPricesFutureAsync("Store 1");
        Future<Double> pricesFutureAsync2 = service.getPricesFutureAsync("Store 2");
        Future<Double> pricesFutureAsync3 = service.getPricesFutureAsync("Store 3");
        Future<Double> pricesFutureAsync4 = service.getPricesFutureAsync("Store 4");
        try {
            pricesFutureAsync1.get();
            pricesFutureAsync2.get();
            pricesFutureAsync3.get();
            pricesFutureAsync4.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %ds%n", (end - start));
        StoreService.ex.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
