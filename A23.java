class Emp{
    int id;
    String name;
    String department;
    void f1(){
        System.out.println("zero");
    }
    void f1(int a){
        System.out.println("int");
    }
    void f1(double b){
        System.out.println("double");
    }
    void f1(long c){
        System.out.println("long");
    }
}
class A23{
    public static void main(String[] args) {
        byte x1=23;
        int x2=9;
        long x3=8;
        short x4=6;
        float x5=43;
        double x6=76;
        String x7="dfgh";
        boolean x8=true;
        char x9='f';
        Emp e=new Emp();
        e.f1();
        e.f1(x1);
        e.f1(x2);
        e.f1(x3);
        e.f1(x4);
        e.f1(x5);
        e.f1(x6);
        // e.f1(x7);
        // e.f1(x8);
        e.f1(x9);
    }
}