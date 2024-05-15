import java.util.*;
class A17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ten number");
        int[] x=new int[10];
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        System.out.println("the value are:-");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        for(int temp:x){
            System.out.println(temp+" ");
        }
    }
}