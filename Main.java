import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Number Conversion Tool:\n1. Convert\n2. Exit ");

    if (sc.hasNextInt()) {
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println(
            "Select input type:\n1. Binary\n2. Decimal\n3. Hexadecimal\n4. Octal"
          );
          int inputType = sc.nextInt();
          if (inputType == 1) {
            System.out.println("Enter binary value: ");
            sc.nextLine();
            String binaryString = sc.nextLine();

            BinaryConversion converter = new BinaryConversion(binaryString);
            System.out.println("Decimal: " + converter.binaryToDecimal());
            System.out.println(
              "Hexadecimal: " + converter.binaryToHexadecimal()
            );
            System.out.println("Octal: " + converter.binaryToOctal());
          } else if (inputType == 2) {
            System.out.println("Enter decimal value: ");
            int decimalValue = sc.nextInt();
            DecimalConversion converter = new DecimalConversion(decimalValue);
            System.out.println("Binary: " + converter.decimalToBinary());
            System.out.println(
              "Hexadecimal: " + converter.decimalToHexadecimal()
            );
            System.out.println("Octal: " + converter.decimalToOctal());
          } else if (inputType == 3) {
            System.out.println("Enter hexadecimal value: ");
            sc.nextLine();
            String hexadecimalValue = sc.nextLine();
            HexadecimalConversion converter = new HexadecimalConversion(
              hexadecimalValue
            );
            System.out.println("Binary: " + converter.hexadecimalToBinary());
            System.out.println("Decimal: " + converter.hexadecimalToDecimal());
            System.out.println("Octal: " + converter.hexadecimalToOctal());
          } else if (inputType == 4) {
            System.out.println("Enter octal value: ");
            String octalValue = sc.nextLine();
            OctalConversion converter = new OctalConversion(octalValue);
            System.out.println("Binary: " + converter.octalToBinary());
            System.out.println("Decimal: " + converter.octalToDecimal());
            System.out.println(
              "Hexadecimal: " + converter.octalToHexadecimal()
            );
          } else {
            System.out.println("Invalid input. Please try again.");
          }
          break;
        case 2:
          System.out.println("Exiting program...");
          System.exit(0);
          break;
      }
    } else {
      String userInput = sc.next();

      if (userInput.equalsIgnoreCase("convert")) {
        System.out.println(
          "Select input type:\n1. Binary\n2. Decimal\n3. Hexadecimal\n4. Octal"
        );
        String inputType = sc.next();
        if (inputType.equalsIgnoreCase("binary")) {
          System.out.println("Enter binary value: ");
          sc.nextInt();
        } else if (inputType.equalsIgnoreCase("decimal")) {
          System.out.println("Enter decimal value: ");
          sc.nextInt();
        } else if (inputType.equalsIgnoreCase("hexadecimal")) {
          System.out.println("Enter hexadecimal value: ");
          sc.nextInt();
        } else if (inputType.equalsIgnoreCase("octal")) {
          System.out.println("Enter octal value: ");
          sc.nextInt();
        } else {
          System.out.println("Invalid input. Please try again.");
        }
      } else if (userInput.equalsIgnoreCase("exit")) {
        System.out.println("Exiting program...");
        System.exit(0);
      }
    }

    sc.close();
  }
}
