
import java.util.Scanner;

class A39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={12,23,34,56,67,78,89};
        int i,ans=0,a;
        System.out.println("enter index");
        try{
            i=sc.nextInt();
            System.out.println("enter value");
            a=sc.nextInt();
            ans=arr[i]/a;
        }catch(Exception ee){
            System.out.println("some error occure:-" +ee);
        }   
        System.out.println("ans "+ ans);
    }
}