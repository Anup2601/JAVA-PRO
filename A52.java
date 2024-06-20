
import java.io.BufferedReader;
import java.io.FileReader;

class A52{
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("A3.java");
            BufferedReader b=new BufferedReader(f);
            String a1=b.readLine();
            String a2=b.readLine();
            String a3=b.readLine();
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            f.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}