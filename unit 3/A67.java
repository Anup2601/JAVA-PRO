
import java.util.Base64;

class A67{
    public static void main(String args []){
        String s="Example of Base64 conversion";
        byte[] b=s.getBytes();
        System.out.println(b);
        //conversion into base 64 Encoder
        String base64=Base64.getEncoder().encodeToString(b);
        System.out.println(base64);
        //conversion base64 to binary (decoder)
        byte[] decodedbyte= Base64.getDecoder().decode(base64);
        String s1=new String(decodedbyte);
        System.out.println(s1);
    }
}