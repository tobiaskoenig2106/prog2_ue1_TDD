public class TDD_Password {


    public static boolean checkPassword(String password) {
        if (password.length() > 25 || password.length() < 5){
            return false;
        }
        return true;
    }

}
