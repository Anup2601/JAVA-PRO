class C1{
    class C11{
       C11 c1=new C11();
       C12 c2=new C12(); 
        void f1(){
            System.out.println("f1 in c11");
        }
    }
    class C12{

    }
    class C13{
        //we can make class inside a class and again 
        class C14{  

        }
    }
}
class C2{
    void f1(){
        class C3{ //we can define a class within a function

        }
    }
}
class A59{
    public static void main(String[] args) {
        C1 c=new C1();
    }
}