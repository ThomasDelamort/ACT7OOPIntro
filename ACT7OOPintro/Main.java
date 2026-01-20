import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        String accountholder;
        String accountNumber;
        double balance;
        boolean Transaction = true; // Deposit and Withdrawal
        boolean validInput = false;
        
        while (!validInput) {
            try {
            System.out.print("Account Holder: ");
            accountholder = sc.nextLine();

            System.out.print("Account Number: ");
            accountNumber = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            balance = sc.nextDouble();

            bankAccount.createNewAccount(accountholder, accountNumber, balance);
            bankAccount.displayAllDetails();
            break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Try again");
                sc.nextLine();
            }
        }
        // Transaction (Deposit and Withdrawal)
        double amount;
        while (Transaction) {
            while (!validInput) {
                try {
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    
                    bankAccount.deposit(amount);
                    bankAccount.displayAllDetails();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input! Pls try again.");
                    sc.nextLine();
                }
            }
            while (!validInput) {
                try {
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    
                    bankAccount.withdraw(amount);
                    bankAccount.displayAllDetails();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input! Pls try again.");
                    sc.nextLine();
                }
            }
        }
    }
}
