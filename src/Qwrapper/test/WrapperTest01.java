package Qwrapper.test;

public class WrapperTest01 {
    static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = false;
        int i = intW; //unboxing
        boolean booleanValue = Boolean.parseBoolean("TruE");
        System.out.println(booleanValue);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println(Character.isUpperCase('9'));
        System.out.println(Character.toUpperCase('9'));
        System.out.println(Character.isLowerCase('9'));
        System.out.println(Character.toLowerCase('9'));
    }
}
