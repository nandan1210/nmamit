import java.io.*;
class Test{
  public static void main(String args[]) throws Exception{
  FileOutputStream fout=new FileOutputStream("xyz.txt"); 
  FileInputStream fin=new FileInputStream("pqr.txt");
  fin.transferTo(fout);
  System.out.println("Transfer Done Successfully...");
  fin.close();
  fout.close();
  }
}
