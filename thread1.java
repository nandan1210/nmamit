class Thread1 extends Thread{
  public void run(){
    System.out.println("Thread1 Started Running");
  }
}
class Thread2 extends Thread{
  public void run(){
    System.out.println("Thread2 Started Running");
  }
}

class Test{
  public static void main(String args[]){
     Thread1 t1=new Thread1();
     Thread2 t2=new Thread2();
     t1.start();
     t2.start(); 
     System.out.println(t1.getName()); 
     System.out.println(t2.getName()); 

  }
}