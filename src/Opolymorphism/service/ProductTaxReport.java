package Opolymorphism.service;

import Opolymorphism.domain.Computer;
import Opolymorphism.domain.Product;
import Opolymorphism.domain.Tomato;

public class ProductTaxReport {
    public static void generateTaxReport(Product product) {
        System.out.println("Starting the tax report:");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Tax Value " + taxValue);
        if (product instanceof Tomato){
            Tomato tomato = ((Tomato) product);
            System.out.println("Best Consumed "+tomato.getBestConsumedBefore());
        }
    }
}
