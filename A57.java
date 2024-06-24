class Shared{
    int x=10;
}
class Thread1 extends Thread{
    Shared ss;
    Thread1(Shared s){
        ss=s;
    }
    public void run(){
        System.out.println("A1");
        System.out.println("A2");
        System.out.println("A3");
        // critical section start 
        synchronized(ss){
            System.out.print("{");
            System.out.print("X="+ss.x);
            ss.x=ss.x*2;
            System.out.print("X="+ss.x);
            System.out.println("}");
        }
        // critical section end 
        System.out.println("A4");
        System.out.println("A5");
        System.out.println("A6");
    }
}
class Thread2 extends Thread{
    Shared ss;
    Thread2(Shared s){
          ss=s;
     }
    public void run(){
            System.out.println("B1");
            System.out.println("B2");
            System.out.println("B3");
            // critical section start
            synchronized(ss){
                System.out.print("{");
                System.out.print("x="+ss.x);
                ss.x=ss.x+2;
                System.out.print("x"+ss.x);
                System.out.println("}");
            }
            // critical section end 
            System.out.println("B4");
            System.out.println("B5");
            System.out.println("B6");
        }
    }

class A57{
    public static void main(String[] args) {
        Shared s=new Shared();
        Thread1 t1=new Thread1(s);
        Thread2 t2=new Thread2(s);
        t1.start();
        t2.start();
    }
}