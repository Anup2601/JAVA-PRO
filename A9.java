import java.util.Scanner;
class A9{
    public static void main(String args[]){
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("you are not eligibal to vote");
        }
        else{
            System.out.println("you are eligible to vote");
        }
    }
}