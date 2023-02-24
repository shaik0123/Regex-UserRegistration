package user_registration_regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public void checkFirstName(String firstName)
    {
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
}
