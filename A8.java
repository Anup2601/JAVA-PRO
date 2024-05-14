
import java.util.Scanner;

// use of Scanner
class A8{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int a=sc.nextInt();
       System.out.println("Enter second number");
       int b=sc.nextInt();
       int c=a+b;
       System.out.println("the sum of number is:-"+c);
       sc.close();
    }
}