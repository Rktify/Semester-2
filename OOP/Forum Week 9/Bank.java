package BankExercise;


import java.util.LinkedList;

public class Bank {
    private LinkedList<Customer> customer;
    private int numberOfCustomers = 0;
    private String bankName;
    public Bank(String bn){
        this.customer = new LinkedList<Customer>();
            this.bankName = bn;
    }

    public void addCustomer(String f, String l){
        numberOfCustomers += 1;
        Customer customer = new Customer(f,l);
        this.customer.add(customer);
    }

    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomerInteger(int index){
        return this.customer.get(index);
    }
}
