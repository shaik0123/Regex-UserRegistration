package user_registration_regex;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {
        System.out.println("Welcome to User Registration Problem");
        System.out.println("UC-1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        UserRegistration obj1 = new UserRegistration();
        obj1.checkFirstName(firstName);


        System.out.println("UC-2");
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        UserRegistration obj2 = new UserRegistration();
        obj2.checkLastName(lastName);

        System.out.println("UC-3");
        System.out.println("Enter your Email: ");
        String email = scanner.next();
        UserRegistration obj3 = new UserRegistration();
        obj3.isValidEmail(email);
    }
}
