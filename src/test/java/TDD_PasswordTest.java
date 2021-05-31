import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TDD_PasswordTest {


    /**
     * Testet ob das Passwort zu lang ist
     */
    @Test
    void checkPassword_tooLong() {
        String password = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

    /**
     * Testet ob das Passwort zu kurz ist
     */
    @Test
    void checkPassword_tooShort() {
        String password = "AbCd";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

    /**
     * Testet ob das Passwort einen Kleinbuchstaben enthält
     */
    @Test
    void checkPassword_lowercaseLetter() {
        String password = "THATSMYPASSWORD";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

    /**
     * Testet ob das Passwort einen Grossbuchstaben enthält
     */
    @Test
    void checkPassword_uppercaseLetter() {
        String password = "thatsmypassword";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

    /**
     * Testet ob das Passwort eine Zahl enthält
     */
    @Test
    void checkPassword_Digit() {
        String password = "thatsmyPassword";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

    /**
     * Testet ob das Passwort eines der folgenden Sonderzeichen enthält ()#$?!%/@
     */
    @Test
    void checkPassword_specialChar() {
        String password = "thatsmyPassword1";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

}