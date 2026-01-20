public class BankAccount {
    private String AccountHolder;
    private String AccountNumber;
    private double Balance;

    public void createNewAccount(String AccountHolder, String AccountNumber, double Balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public void deposit(double Balance) {
        this.Balance += Balance;
    }

    public void withdraw(double Balance) {
        if (Balance > this.Balance) {
            System.out.println("Not possible to withdraw");
        } else {
            this.Balance -= Balance;
        }
    }

    public void displayAllDetails() {
        System.out.println(
        "Account Holder: "+this.AccountHolder+
        "\nAccount Number: "+this.AccountNumber+
        "\nAccount Balance: $"+this.Balance);
    }
}
