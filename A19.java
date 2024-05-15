class A19{
    public static void main(String[] args) {
        int[] a=new int[]{1,2,34,55};
        int[] b=new int[]{12,34,56,78};
        int[] c=new int[]{23,456,3,5,7,89};
        int[][] x=new int[][]{a,b,c};
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[1].length);
        System.out.println(x[2].length);
        System.out.println(x[1][3]);
        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        for(int[] temp :x){
            for(int lol:temp){
                System.out.println(lol+ "  ");
            }
            System.out.println();
        }
    }
}