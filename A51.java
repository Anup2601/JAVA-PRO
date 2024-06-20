import java.io.*;
import java.util.*;
class A51{
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("source file");
            String s=sc.nextLine();
            System.out.println("destination file");
            String d=sc.nextLine();
            FileInputStream f =new FileInputStream(s);
            int size=f.available(); 
            byte[] data=new byte[size];
            f.read(data);
            f.close();
            FileOutputStream fi=new FileOutputStream(d);
            fi.write(data);
            fi.close();
            System.out.println("done");//C:\Users\anupk\OneDrive\Documents\Pictures\Screenshots
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }   
}