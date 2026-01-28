package ZZCinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "Enzo";

    void print(final String param){
        final String lastName = "Izuku";

        class LocalClass {
            public void printName(){
                System.out.println(name+" "+lastName+param);
            }
        }
        new LocalClass().printName();
    }

    static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
