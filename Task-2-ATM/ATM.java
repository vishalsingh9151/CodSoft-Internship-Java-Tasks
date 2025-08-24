import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;
        boolean exit = false;

        System.out.println("💳=== Welcome to Vishal ATM ===");

        while (!exit) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Current Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("✅ Amount deposited. New Balance: $" + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("✅ Withdrawal successful. Remaining Balance: $" + balance);
                    } else {
                        System.out.println("❌ Insufficient balance!");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Vishal ATM. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }

        input.close();
    }
}
