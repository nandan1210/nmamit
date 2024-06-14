class Thread1 extends Thread{
  public void run(){
   Thread t2=new Thread2();
   t2.start();
   try{
     t2.sleep(10000);
   }
   catch(Exception e){}
   System.out.println("Second Thread:"+t2.getState());
 }  
}
class Thread2 extends Thread{
 public void run(){
  Thread t3=new Thread3();
  t3.start();
  try{
    t3.sleep(50000);
  }
  catch(Exception e){}
  System.out.println("Third Thread:"+t3.getState());
   }
  }

class Thread3 extends Thread{}

class Test{
  public static void main(String args[]) throws Exception{
   Thread t1=new Thread1();
   t1.start();
   t1.sleep(2000);
   System.out.println("First Thread:"+t1.getState()); 
  }
}