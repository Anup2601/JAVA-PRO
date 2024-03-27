import java.util.*;
public class natural{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number\n");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
             sum=sum+i;
        }
            System.out.print(sum );
    }
}