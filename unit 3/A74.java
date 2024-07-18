//lamda function
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class A74{
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("first");
        l.add("second");
        l.add("third");
        l.add("fourth");
        l.add("fifth");
        Consumer<String>ff=(item)->System.out.println(item);//use of lamda functiom
        l.forEach(ff);
    }
}