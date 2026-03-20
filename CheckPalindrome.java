
import java.util.Scanner;
public class CheckPalindrome {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "").toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(str+" is not a palindrome String");
                sc.close();
                return;
            }
            i++;
            j--;
        }
            System.out.println(str+" is a palindrome String");
            sc.close();
        }
    }