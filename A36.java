class c2 extends pack1.A1{
    void f1(){
        // x=22; Error: Could not find or load main class A1
        // y=23;  Error: y is not public in A1; cannot be accessed from outside package
        z=24; //Works: z has protected access in A1
        w=25; // Works: w has public access in A1
    }
}
class A36{
    public static void main(String args[]){
        
    }
}