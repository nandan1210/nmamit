import java.util.*;
class Test{
  public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int x=sc.nextInt();
    System.out.println("enter second number:");
    int y=sc.nextInt();
    if(x==0|y==0)
      try{
      throw new Exception();
      }
      catch (Exception e){
        System.out.println("plz enter non zero values only....");
       }
    else
      System.out.println("sum="+(x+y));
  }
}