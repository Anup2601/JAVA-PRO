
import java.io.BufferedReader;
import java.io.FileReader;

//try with resource
class A68{
    public static void main(String[] args) {
        try {
            BufferedReader b=new BufferedReader(new FileReader("A63.java"));
            while (true) { 
                String line=b.readLine();
                if(line==null)
                break;
                System.out.println(line);
            }
            b.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}