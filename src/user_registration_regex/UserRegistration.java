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
}
