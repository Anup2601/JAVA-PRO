import java.util.*;
// odd even 
class B1{
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" the number is even");
        }
        else{
            System.out.println(num+" the given number is odd");
        }
        for(int i=1;i<=num;i++){
            if(num%i==0){
                
                 a++;
            }
        }
        if(a==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}