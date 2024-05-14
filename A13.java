class student{
    int Roll_no;
    String name;
    void printlnDetail(){
        System.out.println("Roll_no="+Roll_no);
        System.out.println("Name="+name);
    }
}
class A13{
    public static void main(String args[]){
        student s1,s2,s3;
        s1=new student();
        s3=new student();
        s2=new student();
        s1.name="Anup";
        s2.name="anisha";
        s3.name="Mona";
        s1.Roll_no=12;
        s2.Roll_no=13;
        s3.Roll_no=14;
        s1.printlnDetail();
        s3.printlnDetail();
        s2.printlnDetail();
    }
}