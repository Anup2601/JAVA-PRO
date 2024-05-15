class A14{
    public static void main(String[] args) {
        //    student.name="a"
        student.collage="xyz";
        // student.f1();
        student.f2();
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.name="a";
        s2.name="b";
        s3.name="c";
        s1.f1();
        s2.f1();
        s3.f1();
        System.out.println();
        s1.name="z";
        s1.collage="qwert";
        s1.f1();
        s1.f1();
        s1.f1();
    }
}
class student{
    String name;
    static String collage;
    void f1(){
        System.out.println(name);
        System.out.println(collage);
    }
    static void f2(){
        // System.out.println(name);
        System.out.println(collage);
    }
}