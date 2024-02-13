public class OctalConversion {

  private String octalValue;

  public OctalConversion(String octalValue) {
    this.octalValue = octalValue;
  }

  public String octalToBinary() {
    StringBuilder binary = new StringBuilder();
    for (int i = 0; i < octalValue.length(); i++) {
      int digit = Character.getNumericValue(octalValue.charAt(i));
      String binarySegment =
        switch (digit) {
          case 0 -> "000";
          case 1 -> "001";
          case 2 -> "010";
          case 3 -> "011";
          case 4 -> "100";
          case 5 -> "101";
          case 6 -> "110";
          case 7 -> "111";
          default -> throw new IllegalArgumentException("Invalid octal digit");
        };
      binary.append(binarySegment);
    }
    return binary.toString().replaceFirst("^0+(?!$)", "");
  }

  public int octalToDecimal() {
    int decimal = 0;
    for (int i = 0; i < octalValue.length(); i++) {
      int digit = Character.getNumericValue(octalValue.charAt(i));
      decimal += digit * Math.pow(8, octalValue.length() - 1 - i);
    }
    return decimal;
  }

  public String octalToHexadecimal() {
    int decimal = octalToDecimal();
    StringBuilder hexadecimal = new StringBuilder();
    char[] hexChars = {
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
    };
    while (decimal > 0) {
      hexadecimal.insert(0, hexChars[decimal % 16]);
      decimal /= 16;
    }
    return hexadecimal.toString();
  }
}
