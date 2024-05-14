import java.util.Scanner;
//use of for loop
class A10{
    public static void main(String[] args) {
        System.err.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}