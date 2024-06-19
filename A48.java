
import java.io.FileInputStream;

class A48{
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("A1.java");
            int a1=f.read();
            while(a1>=0){
                System.out.print((char)a1);
                a1=f.read();
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}