
import java.io.FileInputStream;

class A49{
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("A2.java");
            int size=f.available();
            byte[] data =new byte[size];
            f.read(data);
            String s=new String(data);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}