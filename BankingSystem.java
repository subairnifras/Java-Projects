import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankingSystem {
    private static Map<String, String> userCredentials = new HashMap<>();
    private static Map<String, BankAccount> userAccounts = new HashMap<>();

    static {
        userCredentials.put("nifras@123", "Nifras670");
        userCredentials.put("althaf@123", "Althaf931");
        userCredentials.put("ruwan@123", "Ruwan602");

        userAccounts.put("user1", new BankAccount(1000)); 
        userAccounts.put("user2", new BankAccount(1500)); 
        userAccounts.put("user3", new BankAccount(500));  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Secure Banking System!");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        if (!userCredentials.containsKey(username)) {
            System.out.println("Invalid username! Exiting...");
            return;
        }

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (!userCredentials.get(username).equals(password)) {
            System.out.println("Incorrect password! Exiting...");
            return;
        }

        System.out.println("Login successful! Welcome, " + username + "!");
        BankAccount account = userAccounts.get(username);

        while (true) {
            System.out.println("\nBanking Operations:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Logging out... Thank you for using our banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}