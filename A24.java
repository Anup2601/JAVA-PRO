class Emp{
    int id;
    String department;
    String name;
    Emp (String name1)
    {
        name=name1;
    } 
    Emp(int id1,String name1){
        id=id1;
        name=name1;
    }
}
class A24{
    public static void main(String[] args) {
        Emp s1=new Emp("Anup");
        System.out.println(s1.id);
        System.out.println(s1.name);
        Emp s2=new Emp(23,"Ansh");
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.department);
    }
}