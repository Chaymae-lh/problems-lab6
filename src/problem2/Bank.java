package problem2;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

   
    public void addCustomer(String customerName) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName));
        } else {
            System.out.println("Customer already exists.");
        }
    }

    
    public void addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            customer.addTransaction(amount);
        } else {
            System.out.println("Customer not found.");
        }
    }

    
    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            System.out.println("Statement for " + customer.getName());

            for (Double amount : customer.getTransactions()) {
                double value = amount;
                System.out.println("Transaction: " + value);
            }
        } else {
            System.out.println("Customer not found.");
        }
    }


    private Customer findCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
