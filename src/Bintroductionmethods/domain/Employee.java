package Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void print() {
        System.out.println("---------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries != null) {
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        averageSalary();
    }

    public void averageSalary() {
        if (salaries == null) return;
        for (double salary : salaries){
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\n-------------------------");
        System.out.printf("Average Salary = %.2f", average);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
