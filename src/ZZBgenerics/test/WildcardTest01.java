package ZZBgenerics.test;

abstract class Animal{
    public abstract void consult();
}

class Dog extends Animal{
    @Override
    public void consult() {
        System.out.println("Consulting dogs");
    }
}

class Cat extends Animal{
    @Override
    public void consult() {
        System.out.println("Consulting cats");
    }
}

public class WildcardTest01 {
    static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);
    }
    private static void printConsult(Animal[] animals){
        System.out.println("---------- ");
        for (Animal animal : animals) {
            animal.consult();
        }

    }
}