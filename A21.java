import java.util.*;
class A21{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String s1=sc.nextLine();
        System.out.println("enter 2 string");
        String s2=sc.nextLine();
        boolean b=s1.equals(s2);
        System.out.println(b);
        if(b==true){
            System.out.println("both have same string");
        }
        else{
            System.out.println("both have different string");
        }
    }
}