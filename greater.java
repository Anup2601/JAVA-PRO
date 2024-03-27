import java.util.*;
public class greater{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number\n");
        int num1=sc.nextInt();
        System.out.print("enter another number\n");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.print("both the number is equal\n");
        }
        else if(num1<num2){
            System.out.print("num1 is smaller and num2 is greater\n");
        }
        else{
            System.out.print("num1 is greater and num2 is smaller\n");

        }

    }
}
