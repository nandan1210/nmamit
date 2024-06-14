import java.io.*;

class Test{
  public static void main(String args[]) throws IOException{
     File f1=new File("mynewfile.txt");
     if(f1.createNewFile()){
       System.out.println("File Is Created.....");
      }
     else
      System.out.println("File Already Exist.....");
     //Getting Information About The File
     System.out.println("......File Information......");
     System.out.println("Does File Exist?"+f1.exists());
     System.out.println("Is Readable?"+f1.canRead());
     System.out.println("Is Writeable?"+f1.canWrite());
     System.out.println("File Name:"+f1.getName());
     System.out.println("File Path:"+f1.getAbsolutePath());
  }
}