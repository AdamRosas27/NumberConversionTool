import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number Conversion Tool:\n1. Convert\n2. Exit ");

        if (sc.hasNextInt()) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select input type:\n1. Binary\n2. Decimal\n3. Hexadecimal\n4. Octal");
                    int inputType = sc.nextInt();
                    if (inputType == 1) {
                        break;
                    } else if (inputType == 2) {
                        break;
                    } else if (inputType == 3) {
                        break;
                    } else if (inputType == 4) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }

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

        sc.close();
    }
}