import java.util.Scanner;
public class UpperToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercase version: " + lowerCaseString);
        scanner.close();
    }
}