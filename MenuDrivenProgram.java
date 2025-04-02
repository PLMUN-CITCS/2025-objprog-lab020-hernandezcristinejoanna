{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to keep showing the menu until user exits
        while (true) {
            displayMenu(); // Show menu options
            System.out.print("Enter your choice: ");
            
            // Validate input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            // Handle menu choice
            if (choice == 3) {
                System.out.println("Exiting program. Goodbye!");
                break; // Exit loop
            }
            handleMenuChoice(choice, scanner);
        }
        scanner.close();
    }

    // Method to display menu options
    public static void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
    }

    // Method to handle user menu choice
    public static void handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Hope you're having a great day! 😊");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        int number;

        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String result = (number % 2 == 0) ? "even" : "odd";
            System.out.println("The number " + number + " is " + result + ".");
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.nextLine(); // Clear invalid input
        }
    }
}