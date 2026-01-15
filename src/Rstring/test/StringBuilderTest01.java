package Rstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String name = "Enzo Kuwamoto";
        name = name.concat(" DevDojo"); // deveria ser um name = name.concat...
        name = name.substring(0,3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Enzo Kuwamoto");
        sb.append(" Dev Dojo");
        sb.reverse();
        sb.reverse();
        sb.setLength(0); // ou poderia fazer um sb.delete(0, sb.lenght());
        System.out.println(sb);
    }
}
