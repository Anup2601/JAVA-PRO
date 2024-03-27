import java.util.*;
public class switch1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("press 1 for hindi\npress 2 for english\npress 3 for maithili\n");
        int a=sc.nextInt();
        switch(a){
            case 1: System.out.print("namaste\n");
            break;
            case 2: System.out.print("hello\n");
            break;
            case 3: System.out.print("namaskar\n");
            break;
            default: System.out.print("invalid input\n");
        }
    }
}