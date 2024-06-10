package pack1;
public class A1{
    private int x=2;  // private: accessible only within the same class
    int y=3;     // default (package-private): accessible within the same package
    protected int z=5;  // protected: accessible within the same package and subclasses
    public int w=12; // public: accessible from any other class
}