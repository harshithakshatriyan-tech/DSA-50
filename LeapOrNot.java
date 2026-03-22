import java.util.Scanner;
public class LeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }

    public static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
        //created by @harshitha // 2024-06-01//
    }
    
}
