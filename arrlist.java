import java.util.*;
class Test{
  public static void main(String args[]){
    ArrayList arr1=new ArrayList();
    arr1.add(10);
    arr1.add(20);
    arr1.add(10.67);
    arr1.add("hello");
    arr1.add(true);
    System.out.println(arr1);
    arr1.add(33);
    arr1.add(20);
    System.out.println(arr1);
    Iterator itr=arr1.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
   }
}