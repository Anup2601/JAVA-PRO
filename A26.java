// Generalization 
class A26{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="Anup";
        s1.branch="AI_ML";
        System.out.println(s1.name);
        System.out.println(s1.branch);
        System.out.println();
        person p=s1;
        p.name="akash";
        // p.branch="CSE";
        System.out.println(p.name);
        // System.out.println(p.branch);
    } 
}
class person{
    String name;
}
class student extends person{
    String branch;
}
class empolye extends person{
    int salary;
}

