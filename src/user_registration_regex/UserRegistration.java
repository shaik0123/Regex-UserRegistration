package user_registration_regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public void checkFirstName(String firstName) {
        boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+$").matcher(firstName).matches();
        if(isMatched)
        {
            System.out.println("It is valid firstname");
        }
        else
        {
            System.out.println("It is not a valid firstname");
        }
    }

    public void checkLastName(String lastName) {
        boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+$").matcher(lastName).matches();
        if(isMatched)
        {
            System.out.println("It is valid last name");
        }
        else
        {
            System.out.println("It is not a valid last name");
        }
    }

    public void isValidEmail(String email) {
        boolean isMatched = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$").matcher(email).matches();
        if(isMatched)
        {
            System.out.println("It is valid email");
        }
        else
        {
            System.out.println("invalid email");
        }
    }

    public void isValidMobileNumber(String mobileNumber) {
        boolean isMatched = Pattern.compile("^[1-9]{2}\\s[0-9]{10}$").matcher(mobileNumber).matches() ;
        if(isMatched)
        {
            System.out.println("It is valid mobile number");
        }
        else
        {
            System.out.println("It is not a valid mobile number");
        }
    }

    public void checkCharacters(String password) {
        boolean isMatched = Pattern.compile("[0-9a-zA-Z@!+_.-]{8,}").matcher(password).matches();
        if(isMatched)
        {
            System.out.println("It has minimum 8 character");
        }
        else
        {
            System.out.println("Enter minimum 8 characters");
        }
    }

    public void checkUpperCase(String password) {
        boolean isMatched = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}").matcher(password).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains uppercase letter");
        }
        else
        {
            System.out.println("Enter atleast one uppercase letter");
        }
    }

    public void checkNumericNumber(String password) {
        boolean isMatched = Pattern.compile("(?=.*[0-9])[0-9a-zA-Z@!+_.]{8,}").matcher(password).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains numeric number");
        }
        else
        {
            System.out.println("Enter atleast one numeric number");
        }
    }

    public void checkSpecialCharacter(String password)
    {
        boolean isMatched = Pattern.compile("(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}").matcher(password).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains special character");
        }
        else
        {
            System.out.println("Enter exactly one special character");
        }
    }
}
