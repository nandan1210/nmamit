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
    Node node7=new Node(70);
    Node node8=new Node(80);
    node1.next=node2;
    node2.next=node3;
    node3.next=node4;
    node4.next=node5;
    //inserting a new node between node2 and node3
    node2.next=node8;
    node8.next=node3;
    //inserting new node at the end
    node5.next=node6;
    //inserting new node at the beginning
    node7.next=node1;
    //traversal of a linked list
    Node head=node1;
    head=node7;
    while(head!=null){
       System.out.print(head.data+"-->");
       head=head.next;
     }
    }
}