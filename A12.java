class student{
    String name;
    static String collage;
}
class A12{
    public static void main(String args[]){
        student s1,s2;
        s1=new student();
        s2=new student();
        student s3=new student();
        student.collage="GNIOT";
        s1.name="anup";
        s2.name="ansh";
        s3.name="vishesh";
        System.out.println(s1.name);
        System.out.println(s1.collage);
        System.out.println(s2.name);
        System.out.println(s2.collage);
        System.out.println(s3.name);
        System.out.println(s3.collage);
    }
}