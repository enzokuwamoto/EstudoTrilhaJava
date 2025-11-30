package Pexception.exception.test;

import Pexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest {
    static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }
    public static void login() throws LoginInvalidException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("Username:");
        String typedUsername = sc.nextLine();
        System.out.println("Password:");
        String typedPassword = sc.nextLine();

        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)){
            throw new LoginInvalidException("Username or password is incorrect");
        }
        System.out.println("Login completed!");
    }
}
