package ZZCinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Jorge Jamaica";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner = outer.new Inner();
        inner.printOuterClassAttribute();
    }
}
