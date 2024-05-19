class Shape{
    int x;
    int y;
    void f1(){
        System.out.println(x);
        System.out.println(y);

    }
    void area(){

    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("rectangle");
    }
}
class Tringle extends Shape{
    void area(){
        System.out.println("triangle");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("circle");
    }
}
class A29{
    public static void main(String[] args) {
        Shape s1,s2,s3;
        s1=new Rectangle();
        s2=new Tringle();
        s3=new Circle();
        s1.area();
        s2.area();
        s3.area();
    }
}