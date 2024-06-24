interface A{
    static void f1(){
        System.out.println("F1");
    }
    static void f2(){
        System.out.println("f2");
    }
}
class A65{
    public static void main(String[] args) {
        A.f1();
        A.f2();
    }
}