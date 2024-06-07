// super keyword 
class a{
    // if we don't have blank constructor they show erro when we extends so we use super keyword
    // a(){
    //     System.out.println("a1");
    // }
    a(int x){
        System.out.println("a2");
    }
    a(String s){
        System.out.println("a3");
    }
}
class b extends a{
    b(){
        super(100);
        System.out.println("b1");
    }
    b(int y){
        super("abs");
        System.out.println("b2");
    }
    b(double z){
        super(123);
        System.out.println("b3");
    }
}
class A33{
    public static void main(String[] args) {
        b b1=new b();
        System.out.println();
        b b2=new b(23);
        System.out.println();
        b b3=new b(23.22);
    }
}