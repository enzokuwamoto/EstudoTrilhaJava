package Rstring.test;

public class StringTest01 {
    static void main(String[] args) {
        String name = "Enzo";
        String name2 = "Enzo";
        name = name.concat(" Kuwamoto"); // name += " Kuwamoto"
        System.out.println(name);
        System.out.println(name == name2); // catch the reference
        String name3 = new String("Enzo2");
        String name4 = "Enzo2";
        System.out.println(name3.intern() == name4); // 1 Creating reference variable, 2 a String object, 3 Create in the constant pool.

    }
}
