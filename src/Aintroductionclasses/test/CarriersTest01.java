package Aintroductionclasses.test;

import Aintroductionclasses.domain.Carriers;

public class CarriersTest01 {
    static void main(String[] args) {
        Carriers carriers = new Carriers();
        carriers.name = "Ghisolfi";
        carriers.specification = "Aderente via contrato terceirizado";
        carriers.status = true;
        System.out.println(carriers.name);
        System.out.println(carriers.specification);
        System.out.println(carriers.status);
    }
}
