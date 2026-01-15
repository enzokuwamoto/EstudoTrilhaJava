package Lenum.test;

import Lenum.domain.Customer;
import Lenum.domain.CustomerType;
import Lenum.domain.PaymentType;

public class CustomerTest01 {
    static void main(String[] args) {
        Customer customer = new Customer("Jorel", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Carlos", CustomerType.COMPANY, PaymentType.CREDIT);;

        System.out.println(customer);
        System.out.println(customer2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(200));
        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType.getReportedValue());
    }
}
