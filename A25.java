

class person{

    person() {
        System.out.println("person");
    }
    
}
class student extends person{
    student(){
        System.out.println("student");
    }
}
class A25{
    public static void main(String[] args) {
        student s1=new student();
        System.out.println(s1);
    }
}