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
     node1.next=node2;
     node2.next=node3;
     node3.next=node4;
     node4.next=node5;
     Node head=node1;
     int temp;
     int n=1;
      while(head!=null){
      n++;
      head=head.next;
   }
     
     for(int i=n-1;i>=0;i--){
      head=node1;   
      for(int j=0;j<=i;i++){
        temp=head.next.data;
        head.next.data=head.data;
        head.data=temp;
        head=head.next;
     }
     }
     head=node1;
     while(head!=null){
      System.out.print(head.data+"-->");
      head=head.next;

   }
  
  }
}