package pack1;
class A2 extends A1{
    void f1(){
         // x = 12; // Error: x has private access in A1
        y = 13;   // Works: y has default (package-private) access in A1 and A2 is in the same package
        z = 14;   // Works: z has protected access in A1 and A2 inherits from A1
        w = 15;   // Works: w has public access in A1
    }
}