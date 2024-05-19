// overriding
class person{
    void f1(){
        System.out.println("person f1");
    }
    void f2(){
        System.out.println("person f2");
    }
}
class student extends person{
    void f2(){
        System.out.println("student f2");
    }
    void f3(){
        System.out.println("student f3");
    }
}
class A27{
    public static void main(String[] args) {
        student s1=new student();
        s1.f1();
        s1.f2();
        s1.f3();
        person p=s1;
        p.f1();
        p.f2();
        // p.f3();
    }
}
