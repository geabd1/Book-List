import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tina's Library!");
        System.out.println("Here, you'll be able to track your progress on reading any books available in the library");

        System.out.println("What would you like to do?");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Logging in...");
                System.out.print("Enter your ID: ");
                String id = scanner.next();
                System.out.print("Enter your password: ");
                String password = scanner.next();

                
                break;
            case 2:
                System.out.println("Registering...");

                System.out.print("Enter your name: ");
                String name = scanner.next();
                System.out.print("Enter your ID: ");
                String newId = scanner.next();
                System.out.print("Enter your password: ");
                String newPassword = scanner.next();

                User newUser = new User(name, newId, newPassword);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }
}