class MyThread implements Runnable{
  public void run(){
    System.out.println("Runnable Interface Thread");
  }
}
class Test{
  public static void main(String args[]){
    MyThread t1=new MyThread();
    Thread t2=new Thread(t1);
    t2.start();
  }
}