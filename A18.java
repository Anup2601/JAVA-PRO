import java.util.*;
class A18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 number");
        int[] x=new int[10];
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        int min=x[0];
        for(int i=0;i<x.length;i++){
            if(min>x[i]){
                min=x[i];
            }
        }
        int max=x[0];
        for (int i=0;i<x.length;i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println("the min number is "+min);
        System.out.println("the max number is "+max);
    }
}