import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("Available Conversions:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("Choose conversion (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        float amount = input.nextFloat();

        double result = 0;
        switch(choice) {
            case 1: // USD to INR
                result = amount * 83.00; // Example rate
                System.out.println(amount + " USD = " + result + " INR");
                break;
            case 2: // INR to USD
                result = amount / 83.00;
                System.out.printf("%.2f INR = %.2f USD\n", amount, result);
                break;
            case 3: // EUR to INR
                result = amount * 91.00; // Example rate
                System.out.println(amount + " EUR = " + result + " INR");
                break;
            case 4: // INR to EUR
                result = amount / 91.00;
                System.out.printf("%.2f INR = %.2f EUR\n", amount, result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}