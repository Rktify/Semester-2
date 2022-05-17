package BankExercise;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        Bank bank = new Bank("Bankers");
        int n = 1;
        while (n == 1){
            System.out.println("+===--=Bankers=--===+");
            System.out.println("Welcome and thank you for choosing Bankers!");
            System.out.println("Please choose a number: ");
            System.out.println("1. Create an account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4.Exit");
            System.out.println("+===--=---==---=--===+");
            System.out.print("Choose the number: ");

            int choice = x.nextInt();
            if (choice == 1){
                System.out.println("+==-=Creating an Account=-==+");
                Account acc = new Acct(0);
                System.out.print("Enter your first name: ");
                String fn = x.next();
                System.out.print("Enter your last name: ");
                String ln = x.next();
                bank.addCustomer(fn, ln);
                bank.getCustomerInteger(bank.getNumOfCustomers()-1).setAccount(acc);
            }

            else if (choice == 2){
                System.out.println("+==-=Depositing to Account=-==+");
                System.out.print("Enter index: ");
                int index = x.nextInt();
                if (0 < index && index <= bank.getNumOfCustomers()) {
                    System.out.print("Insert deposit: ");
                    int amount = x.nextInt();
                    bank.getCustomerInteger(index - 1).getAccount().deposit(amount);
                    System.out.printf("Balance: %f \n", bank.getCustomerInteger(index - 1).getAccount().getBalance());
                }
            }

            else if (choice == 3){
                System.out.println("+==-=Withdrawing from Account=-==+");
                System.out.print("Enter index: ");
                int index = x.nextInt();
                if (0 < index && index <= bank.getNumOfCustomers()) {
                    System.out.print("Insert deposit: ");
                    int amount = x.nextInt();
                    bank.getCustomerInteger(index - 1).getAccount().deposit(amount);
                    System.out.printf("Balance: %f \n", bank.getCustomerInteger(index - 1).getAccount().getBalance());
                }
            }

            else{
                n = 0;
            }
        }
    }
}

