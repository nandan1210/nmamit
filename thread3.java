class Thread1 implements Runnable{
   public void run(){
     System.out.println("First Thread Started");
   }
}
class Thread2 implements Runnable{
   public void run(){
     System.out.println("Second Thread Started");
   }
}
class Test{
  public static void main(String args[]){
      Thread1 t1=new Thread1();
      Thread2 t2=new Thread2();
      Thread t3=new Thread(t1,"First_Thread");
      Thread t4=new Thread(t2,"Second_Thread");
      t3.start();
      t4.start();
      System.out.println("First Thread:"+t3.getName());
      System.out.println("Second Thread:"+t4.getName());
  }
}