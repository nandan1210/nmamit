import java.util.*;
class Test{
  public static void main(String args[]){
    Stack stack1=new Stack();
    stack1.push(10);
    stack1.push(20);
    stack1.push(30);   
    stack1.push(40);
    stack1.push(50);
    Iterable itr=stack1.iterator();
    System.out.println(stack1);
    stack1.pop();
    stack1.pop();
    stack1.pop();
    stack1.pop();
    stack1.pop();
    stack1.pop();
    }
  }
