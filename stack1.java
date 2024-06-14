import java.util.Stack;
import java.util.Iterator;
class Test{
  public static void main(String args[]){
    Stack stack1=new Stack(); 
    stack1.push(10);
    stack1.push(20);
    stack1.push(30);
    stack1.push(40);
    stack1.push(50);
   //traversal of stack
   Iterator itr=stack1.iterator();
   while(itr.hasNext()){
      System.out.println(itr.next());
   }
  //pop operation in stack
   stack1.pop();
   while(itr.hasNext()){
      System.out.println(itr.next());
   }
   stack1.pop();
   while(itr.hasNext()){
      System.out.println(itr.next());
   }
   stack1.pop();
   while(itr.hasNext()){
      System.out.println(itr.next());
   }
  }
}