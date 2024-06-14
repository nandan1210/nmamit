import java.util.*;
class Test{
  static int days(String month){
   if(month.equals("February"))
       return 28;
else{
   if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November"))
       return 30;
else
   return 31;
  }
}   
  public static void main(String args[]){
      String month;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Month:");
      month=sc.next();
      System.out.println("No of Days="+days(month));
  }
}