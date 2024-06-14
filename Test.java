import java.util.*;
//Business Logic Class
class Addition{
    int sum(int x,int y){
     int z=x+y;
     return z;     
   }
}
//Execution Logic Class(Main Class/Driver Code)
public class Test{
  static public void main(String abc[]){
     Addition obj=new Addition();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first number:");
     int a=sc.nextInt();
     System.out.println("enter the second number:");
     int b=sc.nextInt(); 
     int r1=obj.sum(a,b); 
     System.out.println("sum="+r1);   
  }
}