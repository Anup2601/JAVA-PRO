
// final 

class A32{
    public static void main(String[] args) {
        final int  x=21;
        System.out.println(x);
         
        // int x=22; we cannot change the valu of final class;
    }
}
final class a{
    void a1(){

    }
}
// final class cannot inharite
// class b extends a{

// }
class c{
    void s1(){
        System.out.println("hello");
    }
    final void s2(){
        System.out.println("hi");
    }
}
class d extends c{
    void s1(){

    }
    // we cannot inharite final function 
    // void s2(){

    // }
}