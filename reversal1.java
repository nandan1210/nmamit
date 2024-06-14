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
     int n=1; 
     Node head=node1;
     while(head!=null){
        System.out.print(head.data+"-->");
        head=head.next;
        n++;
       }
     int temp;
     head=node1;
     for(int i=n;i>0;i--){
        head=node1;
        while(){
        temp=head.data;
        head.data=head.next.data;
        head.next.data=temp;
        }
      }
     head=node1;
      System.out.println("");
      System.out.println("After Reversal:");

     while(head!=null){
        System.out.print(head.data+"-->");
        head=head.next;
     }     
  }
}