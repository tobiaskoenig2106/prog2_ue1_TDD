import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TDD_Password {


    public static boolean checkPassword(String password) {
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasDigit = false;
        boolean hasSpecChar = false;
        int digitcounter = 0;

        if (password.length() > 25 || password.length() < 5) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isLowerCase(character)) {
                hasLowercaseLetter = true;
            }
            if (Character.isUpperCase(character)) {
                hasUppercaseLetter = true;
            }
            if (Character.isDigit(character)) {
                hasDigit = true;
                if (i + 3 < password.length() && character == password.charAt(i + 1) && password.charAt(i + 1) == password.charAt(i + 2) && password.charAt(i + 2) == password.charAt(i + 3)) {
                    return false;
                }
                if (i + 2 < password.length() && character+1 == password.charAt(i + 1) && password.charAt(i + 1)+1 == password.charAt(i + 2)) {
                    return false;
                }
            }
            Pattern pattern = Pattern.compile("[()#$?!%/@]");
            Matcher specChar = pattern.matcher(Character.toString(character));
            Boolean specialChar = specChar.find();
            if (specialChar) {
                hasSpecChar = true;
            }
            if (!Character.isLowerCase(character) && !Character.isUpperCase(character) && !Character.isDigit(character) &&
                    !specialChar) {
                return false;
            }


        }
        return hasLowercaseLetter && hasUppercaseLetter && hasDigit && hasSpecChar;
    }


}
