import java.io.*;
class Display{
  void show(){
      throw new Exception(); 
  }
}
class Test{
  public static void main(String args[]) throws Exception{
     Display obj=new Display();
       obj.show();
      }
}