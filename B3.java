import java.util.*;
// swapping of number 
class B3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in );
        System.out.println("enter teo number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }
}