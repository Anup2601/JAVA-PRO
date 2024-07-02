class Mycollection<T>{
    T x;
}
public class A73{
    public static void main(String[] args) {
        Mycollection m1=new Mycollection();
        Mycollection <String>m2=new Mycollection<>();
        Mycollection<Integer> m3= new Mycollection<>();
        m1.x=23;
        System.out.println(m1.x);
        m1.x="java";
        System.out.println(m1.x);
        m1.x=123.34;
        System.out.println(m1.x);
        m2.x="hi";
        System.out.println(m2.x);
        m2.x="look around";
        System.out.println(m2.x);
        System.out.println(m2.x.toUpperCase());
        m3.x=23;
        System.out.println(m3.x);
        System.out.println(m3.x*3);
    }
}