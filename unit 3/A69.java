
import java.io.BufferedReader;
import java.io.FileReader;

class A69{
    public static void main(String[] args) {
        BufferedReader b;
        try {
            b=new BufferedReader(new FileReader("A60.java"));
            while (true) { 
                String line=b.readLine();
                if(line==null) break;
                System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            if(b!=null) b.close();//some error
        }

    }
}