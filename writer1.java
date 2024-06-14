import java.io.*;
class Test{
  public static void main(String args[]) throws Exception{
    FileWriter fw=new FileWriter("new.txt");
    fw.write("This Is My New File.....");
    System.out.println("Write Operation Done.....");
    fw.close();
  }
}