class Node{
  int data;
  Node left;
  Node right;
  int h=0;
  Node(int data){
    this.data=data;
  }
  int height(Node root){
     if (root==null)
       return;
     height(root.left);
     l++;
     height(root.left);
     r++;
     if(l>r)
      h=l;
     else
      h=r;
     return
  }
}

class Test{
 public static void main(String args[]){
  Node root=new Node(10); 
  root.left=new Node(20); 
  root.right=new Node(30); 
  root.left.right=new Node(40);
  root.right.left=new Node(50);
  root.right.left.right=new Node(60); 
  }  
}