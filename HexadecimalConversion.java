public class HexadecimalConversion {

  private String hexadecimalValue;

  public HexadecimalConversion(String hexadecimalValue) {
    this.hexadecimalValue = hexadecimalValue.toUpperCase();
  }

  public String hexadecimalToBinary() {
    StringBuilder binary = new StringBuilder();
    for (int i = 0; i < hexadecimalValue.length(); i++) {
      String binarySegment =
        switch (hexadecimalValue.charAt(i)) {
          case '0' -> "0000";
          case '1' -> "0001";
          case '2' -> "0010";
          case '3' -> "0011";
          case '4' -> "0100";
          case '5' -> "0101";
          case '6' -> "0110";
          case '7' -> "0111";
          case '8' -> "1000";
          case '9' -> "1001";
          case 'A' -> "1010";
          case 'B' -> "1011";
          case 'C' -> "1100";
          case 'D' -> "1101";
          case 'E' -> "1110";
          case 'F' -> "1111";
          default -> throw new IllegalArgumentException(
            "Invalid hexadecimal digit"
          );
        };
      binary.append(binarySegment);
    }
    return binary.toString();
  }

  public int hexadecimalToDecimal() {
    int decimal = 0;
    for (int i = 0; i < hexadecimalValue.length(); i++) {
      char hexChar = hexadecimalValue.charAt(i);
      int digitValue = "0123456789ABCDEF".indexOf(hexChar);
      decimal = decimal * 16 + digitValue;
    }
    return decimal;
  }

  public String hexadecimalToOctal() {
    String binary = hexadecimalToBinary();
    StringBuilder octal = new StringBuilder();
    int extraZeros = 3 - (binary.length() % 3);
    if (extraZeros != 3) {
      binary = "0".repeat(extraZeros) + binary;
    }
    for (int i = 0; i < binary.length(); i += 3) {
      String segment = binary.substring(i, i + 3);
      int octalDigit = Integer.parseInt(segment, 2);
      octal.append(octalDigit);
    }
    return octal.toString();
  }
}
