class Thread1 extends Thread{
  public void run(){
    System.out.println("First Thread Started....");
  }
}
class Test{
  public static void main(String args[]) throws Exception{
    Thread1 t1=new Thread1();
    System.out.println("Thread State Before Start:"+t1.getState());
    t1.start();
    System.out.println("Thread State After Start:"+t1.getState());
    t1.sleep(10000);
    System.out.println("Final State :"+t1.getState());
  }
}