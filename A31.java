// interface  method
interface  Shape{ // interface ke saat class nahi lagta
    abstract void print();
    abstract void  area();
}
class rectangle implements Shape{
    public void  print(){
        System.out.println("rectangle");
    }
    public void area(){
        System.out.println("l*b");
    }
}
class triangle implements Shape{
    public void print(){
        System.out.println("triangle");
    }
    public void area(){
        System.out.println("1/2*l*b");
    }
}
class A31{
    public static void main(String[] args) {
        Shape s1,s2;
        s1= new rectangle();
        s2=new triangle();
        s1.area();
        s2.area();
    }
}