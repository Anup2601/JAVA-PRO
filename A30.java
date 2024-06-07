
// abstract 

public class A30 {
    public static void main(String[] args) {
        Shape s1,s2,s3;
        s1=new Rectangle();
        s2=new Triangle();
        s3=new circle();
        s1.area();
        s2.area();
        s3.area();
    }
}
abstract class Shape{
    abstract void area();
}
class Rectangle extends Shape{
    void area(){
        System.out.println("rectangle");
    }
}
class circle extends Shape{
    void area(){
        System.out.println("Circle");
    }
}
class Triangle extends Shape{
    void area(){
        System.out.println("triangle");
    }
}
