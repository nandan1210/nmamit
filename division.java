import java.util.Scanner;
class Test{
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:");
    int x=sc.nextInt();
    System.out.println("enter second number:");
    int y=sc.nextInt();
    try{
     System.out.println("x/y="+(x/y));
      }
    catch(Exception e){
      System.out.println("Plz enter non zero number for division");
       }
    finally{
       System.out.println("Exception Successfully Handled....");
       }
  }
}