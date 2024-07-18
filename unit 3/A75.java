import java.util.*;
class A75{
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        l.add("six");
        l.forEach((item)->{
            System.out.println("Original:- "+item);
            System.out.println("Upper case:- "+item.toUpperCase());
        });
    }
}