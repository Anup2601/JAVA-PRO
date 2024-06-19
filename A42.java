import java.util.*;
class InvalidAgeException extends RuntimeException{
    public String toString(){
        return "InvalidAgeException:Valid age should be >18 and <60";
    }
}
class A42{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        age=sc.nextInt();
        if(age<18||age>60){
            System.out.println("you cannot work");
            InvalidAgeException e=new  InvalidAgeException();
            throw e;
        }
        System.out.println("A1");
        System.out.println("A2");
        System.out.println("A3");
        System.out.println("A4");
    }
}