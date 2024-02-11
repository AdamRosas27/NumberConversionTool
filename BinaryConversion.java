public class BinaryConversion {

    public int decimalToBinary() {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder (0 or 1)
            binary.insert(0, remainder); // Prepend the remainder to the binary representation
            decimal /= 2; // Update the decimal number
        }
        return binary.toString(); // Return the binary representation as a string
    }

    public int hexadecimalToBinary() {
        return 0;
    }

    public int octalToBinary() {
        return 0;
    }
}