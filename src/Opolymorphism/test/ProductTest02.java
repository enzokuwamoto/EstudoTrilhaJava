package Opolymorphism.test;

import Opolymorphism.domain.Computer;
import Opolymorphism.domain.Product;
import Opolymorphism.domain.Tomato;
import Opolymorphism.service.ProductTaxReport;

public class ProductTest02 {
    static void main(String[] args) {
        Product computer = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Dutch", 6);
        tomato.setBestConsumedBefore("11/21/2025");

        ProductTaxReport.generateTaxReport(computer);
        ProductTaxReport.generateTaxReport(tomato);
    }
}
