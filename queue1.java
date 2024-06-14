import java.util.*;
class Test{
  public static void main(String args[]){
     ArrayDeque q1=new ArrayDeque();
     q1.add(10);
     q1.add(20);
     q1.add(30);
     q1.add(40);
     q1.add(50);
     System.out.println(q1);
     System.out.println("Removing Elements Of A Queue");
     q1.remove();
     System.out.println(q1);
     q1.remove();
     System.out.println(q1);
     q1.remove();
     System.out.println(q1);
  }
}