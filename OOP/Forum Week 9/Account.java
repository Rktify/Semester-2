package BankExercise;



public class Account{
    private double balance;
    public void Acct(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double money){
        if(money > 0){
            this.balance += money;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double money){
        if(money > 0 && this.balance > money){
            this.balance -= money;
            return true;
        }
        else{
            return false;
        }
    }
}
