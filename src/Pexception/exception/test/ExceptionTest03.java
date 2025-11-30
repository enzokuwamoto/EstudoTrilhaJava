package Pexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest03 {
    static void main(String[] args) {
        openConnection();
    }

    private static String openConnection() {
        try {
            System.out.println("Opening connection");
            System.out.println("Writing to the database");
            if (true){
                throw new RuntimeException();
            }
            return "connected";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Close");
        }
        return "not connected";
    }
}
