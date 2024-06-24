//Anonymous class and function interface
interface  A1{
    void f1();
}
class A61{
    public static void main(String[] args) {
        new A1(){
            public void f1(){
                System.out.println("hi");
            }
        }.f1();
    }
}