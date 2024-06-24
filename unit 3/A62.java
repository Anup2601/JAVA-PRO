// Anonymous class 
class A62{
    public static void main(String[] args) {
        System.out.println("start");
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        }.start();
        System.out.println("end");
    }
}