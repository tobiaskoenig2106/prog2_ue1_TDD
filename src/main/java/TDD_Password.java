public class TDD_Password {


    public static boolean checkPassword(String password) {
        boolean hasLowercaseLetter = false;


        if (password.length() > 25 || password.length() < 5){
            return false;
        }
        for (char character:password.toCharArray()){
            if(Character.isLowerCase(character)){
                hasLowercaseLetter = true;
            }
        }
        return hasLowercaseLetter;
    }

}
