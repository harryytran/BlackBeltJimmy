import java.util.Scanner;
//It is COOL! 
//Jimmy make they. 
//Not harry.
public class DayFourBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;

        System.out.println("Welcome to the Simple ATM");
        

        while (true) {

            System.out.println("Balance: $" + balance);


            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.println("Choose an option (1-3): ");

            int choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter amount: $");
                double amount = scanner.nextDouble();
                if (choice == 1 && amount > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance += (choice == 1) ? -amount : amount;
                    System.out.println("Transaction successful. New balance: $" + balance);
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
