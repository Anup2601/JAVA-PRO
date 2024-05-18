//fibonacci
import java.util.*;
class B6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num from which you want to print the fibonacco series");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int nth=0;
        System.out.println();
        for(int i=2;i<=n;i++){
            nth=n1+n2;
            System.out.println(nth+",");
            n1=n2;
            n2=nth;
        }
    }
}