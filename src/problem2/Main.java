package problem2;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");

        bank.addCustomer("Salam");
        bank.addCustomer("Ali");

        bank.addCustomerTransaction("Salam", 500.0);   // credit
        bank.addCustomerTransaction("Salam", -100.0);  // debit
        bank.addCustomerTransaction("Ali", 300.0);

        bank.printStatement("Salam");
        System.out.println();
        bank.printStatement("Ali");
    }
}

