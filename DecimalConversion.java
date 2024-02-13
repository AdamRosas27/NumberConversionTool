public class DecimalConversion {

  private int decimalValue;

  public DecimalConversion(int decimalValue) {
    this.decimalValue = decimalValue;
  }

  public String decimalToBinary() {
    StringBuilder binary = new StringBuilder();
    int number = decimalValue;

    if (number == 0) return "0";

    while (number > 0) {
      binary.insert(0, number % 2);
      number /= 2;
    }

    return binary.toString();
  }

  public String decimalToHexadecimal() {
    StringBuilder hexadecimal = new StringBuilder();
    int number = decimalValue;
    char[] hexCharacters = {
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

    if (number == 0) return "0";

    while (number > 0) {
      hexadecimal.insert(0, hexCharacters[number % 16]);
      number /= 16;
    }

    return hexadecimal.toString();
  }

  public String decimalToOctal() {
    StringBuilder octal = new StringBuilder();
    int number = decimalValue;

    if (number == 0) return "0";

    while (number > 0) {
      octal.insert(0, number % 8);
      number /= 8;
    }

    return octal.toString();
  }
}
