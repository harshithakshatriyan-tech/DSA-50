import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for uniformity
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    
}
