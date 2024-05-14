
import java.util.Scanner;

class A11{
    public static void main(String args[]){
        System.out.println("enter three number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is the largest number");
        }
        else if(a<b&&b>c){
            System.out.println(b+" is the largest number");
        }
        else if(a<c&&b<c){
            System.out.println(c+" is the largest");
        }
        else{
            System.out.println("All are equal");
        }
    }
}