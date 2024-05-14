import java.util.*;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of rectangle\n");
        int l=sc.nextInt();
        System.out.print("enter the breadth of rectangle\n");
        int b=sc.nextInt();
        int area=l*b;
        System.out.print("the area of rectangle is :-");
        System.out.print(area);
        sc.close();
    }
}