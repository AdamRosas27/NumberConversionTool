public class BinaryConversion {

    public int decimalToBinary(int userNumber) {
        if (userNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (userNumber > 0) {
            int remainder = userNumber % 2;
            binary.insert(0, remainder);
            userNumber /= 2;
        }
        return userNumber.toString();
    }

    public int hexadecimalToBinary() {
        return 0;
    }

    public int octalToBinary() {
        return 0;
    }
}
