import java.util.*;
class InvalidAge extends Exception{

}
class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter Your Age");
    int age=sc.nextInt();
    if(age<21)
      try{
      throw new InvalidAge();
      }
      catch(InvalidAge e){
         System.out.println(e);
      }
    else
      System.out.println("Welcome To Our Platform");
  }
}