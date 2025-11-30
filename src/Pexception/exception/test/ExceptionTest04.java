package Pexception.exception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest04 {
    static void main(String[] args) {
        try{
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Inside array index.");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }

//        try {
//            mayThrowException();
//            // e = new SQLException(); -> final variable
//        } catch (SQLException | FileNotFoundException e){
//            e.printStackTrace();
//            // e = new RuntimeException(); // final variable
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
