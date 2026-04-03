import java.util.Scanner;   
public class LongestSubstring {   
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a string: ");   
        String str = sc.nextLine();   
        int maxLength = 0;   
        String longestSubstring = "";   
        for (int i = 0; i < str.length(); i++) {   
            for (int j = i + 1; j <= str.length(); j++) {   
                String substring = str.substring(i, j);   
                if (isUnique(substring) && substring.length() > maxLength) {   
                    maxLength = substring.length();   
                    longestSubstring = substring;   
                }   
            }   
        }   
        System.out.println("Longest substring without repeating characters: " + longestSubstring);   
    }   

    private static boolean isUnique(String str) {   
        boolean[] charSet = new boolean[256]; // Assuming ASCII character set
        for (char c : str.toCharArray()) {   
            if (charSet[c]) { // Character already found in the current substring
                return false;   
            }   
            charSet[c] = true; // Mark character as found
        }   
        return true; // All characters are unique
    }   
}