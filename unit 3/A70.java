
import java.io.BufferedReader;
import java.io.FileReader;

public class A70{
    public static void main(String[] args) {
        try(BufferedReader b=new BufferedReader(new FileReader("A60.java")))
        {
            while (true) { 
                String line=b.readLine();
                if(line==null)break;
                System.out.println(line);
            }   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}