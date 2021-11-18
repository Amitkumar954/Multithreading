//multithreated application
class MyThread extends Thread {
    /* public static void main(String[] args) {
         Thread obj =Thread.currentThread();
         obj.setName("AKS");
         System.out.println(obj.isAlive());// in running state print true otherwise false
         System.out.println(obj.getName());
         System.out.println(obj.isDaemon());// background threads is known as Daemon threads
         obj.setPriority(Thread.MAX_PRIORITY);
         System.out.println(obj.getPriority());
         System.out.println(obj.getId());
         System.out.println(obj.getState());
      */
    public void run(){
        //  for (int i=0;i<10;i++){
        //  System.out.println("MyThread "+ i);
        //  }
        System.out.println(10/0);
    }
}
class Test56{
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        // or
        //Thread obj1 =new MyThread();// polymorphic behaviour
        obj.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread "+1);
        }
    }
}