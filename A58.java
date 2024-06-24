

class Customers{
    int amount=0;
    synchronized void deposit(int amt){
        System.out.println("Initial "+amount);
        amount=amount+amt;
        System.out.println("After deposit"+amount);
        notify();
    }
    synchronized void withdrow(int amt){
        try{
            wait();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Initial  :-"+amount);
        amount=amount-amt;
        System.out.println("after withdrow  :-"+amount);

    }
}
class Thread1 extends Thread{
    Customers cc;
    Thread1(Customers c){
        cc=c;
    }
    public void run(){
        cc.withdrow(2000);
    }
}
class Thread2 extends Thread{
    Customers cc;
    Thread2(Customers c){
        cc=c;
    }
    public void run(){
        cc.deposit(10000);
    }
}
class A58{
    public static void main(String[] args) {
        Customers c=new Customers();
        Thread1 t1=new Thread1(c);
        Thread2 t2=new Thread2(c);
        t1.start();
        t2.start();
    }
}