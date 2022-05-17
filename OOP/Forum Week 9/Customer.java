package BankExercise;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getLastname() {
        return this.lastName;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }
}

