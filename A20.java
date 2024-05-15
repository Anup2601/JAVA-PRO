
import java.util.Scanner;

class A20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number in matrix3x5");
        int[][] x=new int[3][5];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is :-");
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+"   ");
            }
            System.out.println();
        }
    }
}