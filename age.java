import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your age:");
    int age=sc.nextInt();
    if(age<18)
     try{
      throw new Exception();
       }
     catch(Exception e){
       System.out.println("You Are Eligible To Vote");
     }
    else
      System.out.println("You Are Welcome To Vote");
  }
}