import java.util.*;
class B2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter principal , rate of interst and time");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println("the simple interst is :-"+si);
    }
}