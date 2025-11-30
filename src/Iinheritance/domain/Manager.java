package Iinheritance.domain;

public class Manager extends Employee{
    private String department;


    static{
        System.out.println("Inside static init block subclass");
    }

    {
        System.out.println("Inside init block subclass");
    }

    public Manager(String name, String socialSecurityNumber, Address address, double salary, String department) {
        super(name, socialSecurityNumber, address, salary);
        this.department = department;
        System.out.println("Inside constructor block subclass");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
