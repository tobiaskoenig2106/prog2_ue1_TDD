import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TDD_PasswordTest {



    @Test
    void checkPassword_tooLong() {
        String password = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        assertEquals(false, TDD_Password.checkPassword(password));
    }

}