class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
  }
}
class Test{
  public static void main(String args[]){
      Node node1=new Node(10);
      Node node2=new Node(20);
      Node node3=new Node(30);
      Node node4=new Node(40);
      Node node5=new Node(50);
      Node node6=new Node(60);
      node1.next=node2;
      node2.next=node3;
      node3.next=node4;
      node4.next=node5;
      node5.next=node6;
      node6.next=node1;

      Node head=node1;
      Node k=head.next;
      int n=1;
      int n1=1;
 
      while(k!=head){
        n++;
        k=k.next;
      }
      for(int i=0;i<9n/2;i++){
         System.out.print(head.data+"-->");
         head=head.next;
       }
       System.out.println("");
      for(int i=n/2+1;i<=n;i++){
         System.out.print(head.data+"-->");
         head=head.next;       
       }
     
       }
   
}