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

}