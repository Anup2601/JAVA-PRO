import java.util.*;
public class age{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your age\n");
    int age=sc.nextInt();
    if(age<=18){
        System.out.print("you are not eligibal to vote\n");
    }
    else{
        System.out.print("you are eligibal to vote\n");
    }
    }
}