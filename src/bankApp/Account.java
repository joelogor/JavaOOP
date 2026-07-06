package bankApp;

public class Account {

    private int balance;

    private String pin = "1234";

    public Account(String firstName, String lastName, String accountNumber, String pin) {
    }


    public int getBalance(String inputPin) {
        validatePin(inputPin);
        if(pin != inputPin || ! pin.equals(inputPin)  )throw new IllegalArgumentException("incorrect pin");

        return balance;
    }

    public boolean validatePin(String inputPin) {
        if(inputPin != pin ) return false;

        boolean valid = true;
        return valid;

    }

    public void deposit(int amount) {
        boolean depositGreaterThanZero = amount > 0;
        if(depositGreaterThanZero) balance = balance + amount;
    }
    public void withdraw(int amount) {
        boolean balanceIsGreaterThanZero = balance > 0;
        boolean amountIsGreaterThanZero = amount > 0;
        if(balanceIsGreaterThanZero && amountIsGreaterThanZero) balance = balance - amount;
    }

    public void registerPin(String pin) {
        this.pin = pin;
    }
}