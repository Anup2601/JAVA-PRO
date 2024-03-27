import java.util.*;
public class even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number\n");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}