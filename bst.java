import java.util.*;
class Node{
  int data;
  Node left;
  Node right;
  TreeSet arr=new TreeSet();
  Node(int data){
    this.data=data;
  } 
  void collect(Node root){
   if (root==null)
     return;
   collect(root.left);
   arr.add(root.data);
   collect(root.right);
  }
  void toBST(Node root){
     if(root==null)
        return;
     toBST(root.left);
     root.data=(int)arr.first();
     arr.remove((int)arr.first());
     toBST(root.right);
  }
  void traverse(Node root){
     if(root==null)
       return;
     traverse(root.left);
     System.out.print(root.data+"-->");
     traverse(root.right);
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
     root.collect(root);
     System.out.println(root.arr);
     root.toBST(root);
     root.traverse(root);
     }
}
