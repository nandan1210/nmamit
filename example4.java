class Thread1 extends Thread{
  public void run(){
    System.out.println("First Thread Started Running");
  }
}
class Thread2 extends Thread{
  public void run(){
    System.out.println("Second Thread Started Running");
  }
}
class Test{
  public static void main(String args[]){
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.start();
    t2.start();
    System.out.println("First Thread Name:"+t1.getName());
    System.out.println("Second Thread Name:"+t2.getName());
    //changing the names of threads
    t1.setName("FirstThread");
    t2.setName("SecondThread");
    System.out.println("After Changing The Names Of Threads");
    System.out.println("First Thread Name:"+t1.getName());
    System.out.println("Second Thread Name:"+t2.getName());
   }
}