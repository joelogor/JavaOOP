package bankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    Bank myBank;

    @BeforeEach
    public void setUp() {
        myBank = new Bank("UBA");
    }

    @Test
    public void createMyBank_accountListIsZeroTest() {
        Bank myBank = new Bank("DemoBank");

        assertEquals(0, myBank.getSize());
    }
}