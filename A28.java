// abstract class mai define and declayer dono hota hai isska object nahi banta hai 
abstract class A{
    abstract void f1();//declayer
    void f2(){
        System.out.println("abstract f2");//define
    }
}
// ismai hum class nahi use karte hai ismai hum shirf declyar karta hai
interface  B{
    void f1();//declayer
    void f2();//declayer
}
//default class iss mai hum define he shirf karte hai 
class C{
    void f1(){
        System.out.println("default f1");
    }
    void f2(){
        System.out.println("default f2");
    }
}
// abstract or default mai hum shirf extends keyword use karte hai or jo declayer na ho usko declayer karte hai
class D extends A{
    void f1(){
        System.out.println("f1  class d");
    }
}
class E extends C{

}
// interface mai hum implements keyword use karte hai or declaye karte hai decylar kartye time hum function ko public kar dete hai
class F implements  B{
    public void f1(){
        System.out.println("class f, f1()");
    }
    public void f2(){
        System.out.println("class f, f2()");
    }
}
class A28{
    public static void main(String[] args) {
        // abstract or interface ko hum object nahi bana sakte hai
        D a=new D();
        a.f1();
        a.f2();
        E b=new E();
        b.f1();
        b.f2();
        F c=new F();
        c.f1();
        c.f2();
    }
}