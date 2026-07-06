package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private int count;
    private String name;
    private List<Account> accounts;

    public Bank(String bankName) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void registerCustomer(String firstName, String lastName, String pin) {
        String accountNumber = getAccountNumber();
        Account customer = new Account(firstName, lastName, accountNumber, pin);
        this.accounts.add(customer);
    }

    private String getAccountNumber() {
        generateAccountNumber();
        return count + " ";
    }

    private void generateAccountNumber() {
    }

    public int getSize() {
        return count;
    }

}