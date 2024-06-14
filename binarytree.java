class Node{
   int data;
   Node left;
   Node right;
   int n=0;
   Node(int data){
      this.data=data;
   }
  void inOrder(Node node){
    if (node==null)
      return;
    else{
           inOrder(node.left);
           System.out.print(node.data+"-->");
           n++;
           inOrder(node.right);
       }
  }
  
  void preOrder(Node node){
    if (node==null)
      return;
    else{
           System.out.print(node.data+"-->");
           preOrder(node.left);
           preOrder(node.right);
       }
  }
 
  void postOrder(Node node){
    if (node==null)
      return;
    else{
           postOrder(node.left);
           postOrder(node.right);
           System.out.print(node.data+"-->");
           
       }
  }
  int treeHeight(Node node){
     int h=1;
     int l=1;
     int r=1;
     if(node==null)
       return 0;
     else{
     l=treeHeight(node.left);
       r=treeHeight(node.right);
       if(l>r)
         h=h+l;
       else
         h=h+r;
       return h;
     }
   }
}



class Test{
  public static void main(String args[]){
     Node root=new Node(10);
     root.left=new Node(20);
     root.right=new Node(30);
     root.left.left=new Node(40);
     root.left.right=new Node(50);
     root.right.left=new Node(60);
     root.right.right=new Node(70);
     System.out.println("In Order Traversal");
     root.inOrder(root);
     System.out.println("");
     System.out.println("Pre Order Traversal");
     root.preOrder(root);
     System.out.println("");
     System.out.println("Post Order Traversal"); 
     root.postOrder(root);
     System.out.println("");
     System.out.println("No Of Nodes="+root.n); 
     int height=root.treeHeight(root);
     System.out.println("");
     System.out.println("Height Of Tree="+height);

  }
}