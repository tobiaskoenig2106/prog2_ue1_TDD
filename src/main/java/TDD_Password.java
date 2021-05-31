import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TDD_Password {


    public static boolean checkPassword(String password) {
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasDigit = false;
        boolean hasSpecChar = false;

        if (password.length() > 25 || password.length() < 5){
            return false;
        }
        for (char character:password.toCharArray()){
            if(Character.isLowerCase(character)){
                hasLowercaseLetter = true;
            }
            if(Character.isUpperCase(character)){
                hasUppercaseLetter = true;
            }
            if(Character.isDigit(character)){
                hasDigit = true;
            }
            Pattern pattern = Pattern.compile("[()#$?!%/@]");
            Matcher specChar = pattern.matcher(Character.toString(character));
            if (specChar.find()){
                hasSpecChar = true;
            }
        }
        return hasLowercaseLetter && hasUppercaseLetter && hasDigit && hasSpecChar;
    }

}
