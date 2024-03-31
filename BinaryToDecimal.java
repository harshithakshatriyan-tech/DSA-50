import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        int decimalValue = binaryToDecimal(binaryString);
        System.out.println("The decimal value of " + binaryString + " is: " + decimalValue);
    }

    public static int binaryToDecimal(String binaryString) {
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
}
