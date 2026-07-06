package bankApp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;
    @BeforeEach
    public void setup() {
        account = new Account();

    }    @Test
        public void checkBalanceWithCorrectPin_returnsBalanceTest() {

            account.registerPin("1234");

            assertEquals(0, account.getBalance("1234"));
        }

        @Test
        public void checkBalanceWithIncorrectPin_throwsExceptionAndDoesNotRevealBalanceTest() {
            account.registerPin("1234");
            assertThrows(IllegalArgumentException.class, () -> account.getBalance("0000"));
        }


    @Test
    public void deposit200inEmptyAccount_balanceIs200Test(){
        //Given
        assertEquals(0,account.getBalance("1234"));
        //When
        account.deposit(200);
        //Assert
        assertEquals(200,account.getBalance("1234"));
    }
    @Test
    public void deposit200_deposit500_balanceIs700Test(){

        assertEquals(0,account.getBalance("1234"));

        account.deposit(200);

        account.deposit(500);

        assertEquals(700,account.getBalance("1234"));
    }
    @Test
    public void depositNegative50_balanceIs0Test(){

        assertEquals(0,account.getBalance("1234"));

        account.deposit(-50);

        assertEquals(0,account.getBalance("1234"));
    }
    @Test
    public void withdraw50InEmptyAccount_balanceIs0Test(){

        assertEquals(0,account.getBalance("1234"));

        account.withdraw(50);
        account.validatePin("1234");
        assertEquals(0,account.getBalance("1234"));
    }
    @Test
    public void withdraw200FromAccountBalance500_balanceIs300Test(){

        account.deposit(500);

        account.withdraw(200);

        assertEquals(300,account.getBalance("1234"));
    }
    @Test
    public void cannotWithdrawNegativeAmountTest(){
        account.deposit(500);
        account.withdraw(-200);
        assertEquals(500, account.getBalance("1234"));
    }
}


//