record Employee(String name,int salary){
    static String company="Microsoft";
    void tax(){
        System.out.println(salary*.5);
    }
}
public class A72{
    public static void main(String[] args) {
        Employee e=new Employee("papu", 12999);
        String s1=e.name();
        int s2=e.salary();
        String s3=e.company;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(e);
    }
}