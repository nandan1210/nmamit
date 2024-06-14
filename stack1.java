class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
  }
  }

class Stack{
  Node head;
   int Capacity=7;
   int count=1;
   Node newNode;
   void push(int data){ 
   if (count>Capacity)
    System.out.println("Stack Overflow...");
   else{
   newNode=new Node(data);
   head=newNode;
   newNode=newNode.next;
   count++;
   }
  }
  void pop(){
    if(count<0)
      System.out.println("Stack Underflow.....");
    else{
    head=null;
    count--;
    }
  }
  void traverse(){
     Node k=node1;
     while(k!=null){
       System.out.print("k.data"+"-->");
       k=k.next;

    }
  }
}
class Test{
   public static void main(String args[]){
     Stack stack1=new Stack();
     stack1.push(10);
     stack1.push(20);
     stack1.push(30);
     stack1.push(40);
     stack1.push(50);
     stack1.push(60);
     //stack1.push(70);
     //stack1.push(80);
   }
}