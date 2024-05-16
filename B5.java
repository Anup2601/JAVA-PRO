//palindrome
import java.util.*;
class B5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int a=num;
        int rev=0;
        while(num!=0){
            int r=num%10;
            rev=rev*10+r;
            num=num /10;
        }
        System.out.println(rev);
        if(rev==a){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}