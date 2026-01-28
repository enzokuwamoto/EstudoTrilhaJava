package ZZCinnerclasses.test;




public class OuterClassesTest03 {
    protected String name = "enzo";
    static class Inner{
        public void printOuterClassAttribute(){
            System.out.println(new OuterClassesTest03().name);
        }
    }
    static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}
