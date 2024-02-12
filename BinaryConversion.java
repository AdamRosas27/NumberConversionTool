public class BinaryConversion {

    private String binaryString;

    public BinaryConversion(String binaryString) {
        this.binaryString = binaryString;
    }

    public int binaryToDecimal() {
        int decimalValue = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            char bit = binaryString.charAt(length - 1 - i);
            if (bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }
        return decimalValue;
    }

    public String binaryToHexadecimal() {
        String hexString = "";
        String hexChars = "0123456789ABCDEF";
        int sum = 0;
        int length = binaryString.length();
        // Process each group of 4 bits
        for (int i = 0; i < length; i += 4) {
            sum = 0;
            // Process each bit in the group
            for (int j = 0; j < 4 && (i + j) < length; j++) {
                char bit = binaryString.charAt(length - 1 - (i + j));
                if (bit == '1') {
                    sum += Math.pow(2, j);
                }
            }
            hexString = hexChars.charAt(sum) + hexString;
        }
        return hexString;
    }

    public int binaryToOctal() {
        int octalValue = 0;
        int length = binaryString.length();
        int sum = 0;
        int power = 0;
        for (int i = length - 1; i >= 0; i--) {
            char bit = binaryString.charAt(i);
            if (bit == '1') {
                sum += Math.pow(2, power);
            }
            power++;
            if (power == 3 || i == 0) {
                octalValue += sum * Math.pow(10, (length - 1 - i) / 3);
                power = 0;
                sum = 0;
            }
        }
        return octalValue;
    }

    public static void main(String[] args) {
        BinaryConversion converter = new BinaryConversion("1111");
        System.out.println("Decimal: " + converter.binaryToDecimal());
        System.out.println("Hexadecimal: " + converter.binaryToHexadecimal());
        System.out.println("Octal: " + converter.binaryToOctal());
    }
}
