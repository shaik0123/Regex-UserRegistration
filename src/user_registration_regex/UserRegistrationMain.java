package user_registration_regex;

import java.util.Scanner;

public class UserRegistrationMain {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Welcome to User Registration Problem");
        System.out.println("UC-1");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        UserRegistration obj1 = new UserRegistration();
        obj1.checkFirstName(firstName);


        System.out.println("UC-2");
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        UserRegistration obj2 = new UserRegistration();
        obj2.checkLastName(lastName);

        System.out.println("UC-3");
        System.out.println("Enter your Email: ");
        String email = scanner.nextLine();
        UserRegistration obj3 = new UserRegistration();
        obj3.isValidEmail(email);

        System.out.println("UC-4");
        System.out.println("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();
        UserRegistration obj4 = new UserRegistration();
        obj4.isValidMobileNumber(mobileNumber);

        System.out.println("UC-5");
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        UserRegistration obj5 = new UserRegistration();
        obj5.checkCharacters(password);

        System.out.println("UC-6");
        System.out.println("Enter password to check upper case ");
        obj5.checkUpperCase(password);

        System.out.println("UC-7");
        System.out.println("Enter password to check numeric value ");
        obj5.checkNumericNumber(password);

        System.out.println("UC-8");
        System.out.println("Enter password to check special character ");
        obj5.checkSpecialCharacter(password);

        System.out.println("UC-9");
        System.out.println("Enter password to check valid or invalid ");
        obj5.isValidPassword(password);
    }
}
