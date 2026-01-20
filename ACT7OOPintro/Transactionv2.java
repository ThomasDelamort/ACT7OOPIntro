import java.util.InputMismatchException;
import java.util.Scanner;

public class Transactionv2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean val = false;
        boolean tans = false;
        BankAccount bankAccount = new BankAccount();
        String name = "Ronnie Lauron";
        String number = "141";
        double balance = 500;
        bankAccount.createNewAccount(name, number, balance);
        bankAccount.displayAllDetails();

        String forvalidation = "";
        double amount;
        
        System.out.print("Enter amount to deposit: ");
        forvalidation = in.nextLine();
        
        if (forvalidation.equalsIgnoreCase("stop")) {
            System.out.println("It works");
        } else {
            amount = Double.parseDouble(forvalidation);
            bankAccount.deposit(amount);
            bankAccount.displayAllDetails();     
        }

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

