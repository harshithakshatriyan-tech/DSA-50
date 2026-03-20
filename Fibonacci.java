
import java.util.Scanner;
public class Fibonacci {
public static void main (String[] arguments){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of terms");
int n =sc.nextInt();
int firstNum = 0;
int secondNum = 1;
for(int i =0;i< n ; i++){
int nextNum=firstNum+secondNum;
firstNum=secondNum;
secondNum=nextNum;
System.out.println(nextNum+",");
sc.close();
}
}
}

