class Node{
  int data;
  Node next=null;
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
      Node node7=new Node(70);
      Node node8=new Node(80);
      node1.next=node2;
      node2.next=node3;
      node3.next=node4;
      node4.next=node5;
      node5.next=node6;
      node6.next=node7;
      node7.next=node8;
      node8.next=node1;
      Node first=node1; 
      int n=1;
      Node head=node1.next;
      while(head!=node1){
         n++;
         head=head.next;
      }
      int i=1;
      int j=1;
      head=node1;
      Node k=head.next;
      while(i<=n/2){
         System.out.println("");
         System.out.print(head.data+" ");
         while(j<n/2){
            k=k.next; 
            j++; 
           }
         System.out.print(k.data);
         head=head.next;
         k=head.next; 
         j=1;
         i++;
       }     
  }
}
