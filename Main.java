import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number Conversion Tool:\n1. Convert\n2. Exit");

        if (sc.hasNextInt()) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    System.exit(0);
                case 3:
                    System.out.println("Invalid input. Please try again.");
            }
        }

        else {
            String userInput = sc.next();

            if (userInput.equalsIgnoreCase("convert")) {
                return;
            } else if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}