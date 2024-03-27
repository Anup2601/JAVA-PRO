public class half_pyramid{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j );
            }
            System.out.print("\n");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int num=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
                for(int j=1;j<=i;j++){
                    System.out.print(num+"  ");
                    num++;
                }
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    } 
}