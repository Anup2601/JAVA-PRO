import java.util.*;
class B4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int y=sc.nextInt();
        if(y%4==0){
            if(y%100==0){
                System.out.println("leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
}