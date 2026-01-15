package devdojo.classes.introduction;

import com.sun.security.jgss.GSSUtil;

public class Conditional {
    static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            System.out.println("Menor de idade, sem autorização para dirigir.");
        } else {
            System.out.println("Maior de idade, tem autorização para dirigir.");
        }

        // else if
        String category = "NOTHING";

        if (age > 0 && age <= 12) {
            category = "Kid";
        } else if (age > 12 && age <= 18) {
            category = "Teenager";
        } else {
            category = "Adult";
        }
        System.out.println("Category = " + category);

        // ternary operator
        int saveMoney = 3000;
        String shouldBuyComputer = "buy Computer";
        String shouldNotBuyComputer = "buy Computer";
        String displayMessage = saveMoney > 2000 ? shouldBuyComputer : shouldNotBuyComputer;
        System.out.println(displayMessage);

        int salary = 10000;
        double taxa = 0;
        double netSalary = 0;
        if (salary > 0 && salary <= 2259) {
            System.out.println("Salario isento");
            netSalary = salary;
        } else if (salary <= 2826) {
            taxa = 7.5;
            netSalary = salary * 0.925;
        } else if (salary <= 3751) {
            taxa = 15;
            netSalary = salary * 0.85;
        } else if (salary <= 4664) {
            taxa = 22.5;
        } else {
            taxa = 27.5;
        }
        netSalary = salary * (1 - (taxa / 100));
        System.out.println("Taxa de " + taxa + "%.");
        System.out.println("Salario líquido = " + netSalary);

        // switch case
        String gender = "M";
        switch (gender) {
            case "M":
                System.out.println("Male.");
                break;
            case "F":
                System.out.println("Female.");
                break;
            default:
                System.out.println("Invalid.");
                break;
        }
            // exercise switch
        int dia_da_semana = 1;
        switch (dia_da_semana){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Invalid option");
                break;
            }

    }
}

