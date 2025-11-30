package Opolymorphism.test;

import Opolymorphism.domain.Computer;
import Opolymorphism.domain.Product;
import Opolymorphism.domain.Television;
import Opolymorphism.domain.Tomato;
import Opolymorphism.service.ProductTaxReport;

public class ProductTest01 {
     public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7",1000);
        Tomato tomato = new Tomato("Italin", 5);
        Television television = new Television("Samsung 50/", 2500);

         System.out.println("-------------------------");
         ProductTaxReport.generateTaxReport(computer);
         System.out.println("-------------------------");
         ProductTaxReport.generateTaxReport(tomato);
         System.out.println("-------------------------");
         ProductTaxReport.generateTaxReport(television);


         System.out.println("Mesmos atributos, ok!");
         System.out.println("\n--------------------");
         Product product1  = new Computer("Ryzen 9", 1000);
         System.out.println(product1.getName());
         System.out.println(product1.getPrice());
         System.out.println(product1.calculateTaxValue());
         System.out.println("-----------------------");
         Product tomato1  = new Tomato("Dutch", 6);
         System.out.println(tomato1.getName());
         System.out.println(tomato1.getPrice());
         System.out.println(tomato1.calculateTaxValue());
         System.out.println("-----------------------");

     }
}
