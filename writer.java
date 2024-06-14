import java.io.*;
class Test{
  public static void main(String args[]) throws IOException,FileNotFoundException{
    int i;
    FileInputStream fin=new FileInputStream("abc.txt");
    FileOutputStream fout=new FileOutputStream("pqr.txt");
    fout.write(fin.readAllBytes()); 
    System.out.println("Transfer Operation Successful.....");
    fin.close();
    fout.close();   
  }
}