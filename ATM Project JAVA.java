import java.util.*;

public class ATM {
    private static final int PIN = 1234;
    private static int balance = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN Number");

        int password = sc.nextInt();

        if (password == PIN) {
            System.out.println("Enter Your Name");
            String name = sc.next();
            System.out.println("Welcome " + name);

            while (true) {
                displayMenu();

                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        addAmount(sc);
                        break;
                    case 3:
                        withdrawAmount(sc);
                        break;
                    case 4:
                        printReceipt();
                        break;
                    case 5:
                        System.out.println("Thanks for Visiting our ATM");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Wrong PIN Number");
        }
    }

    private static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Add Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Print Receipt");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void checkBalance() {
        System.out.println("Your current balance is " + balance);
    }

    private static void addAmount(Scanner sc) {
        System.out.println("Enter the amount to add to your account");
        int addAmount = sc.nextInt();
        balance += addAmount;
        System.out.println("Successfully Credited");
    }

    private static void withdrawAmount(Scanner sc) {
        System.out.println("Enter the amount to withdraw");
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn");
        } else {
            System.out.println("Insufficient Balance. Please enter a valid amount.");
        }
    }

    private static void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("Available balance: " + balance);
        // Include other details as needed
        System.out.println("Thanks for Coming. Have a Good Day");
    }
}
