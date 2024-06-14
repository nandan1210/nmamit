import java.util.*;
class Test{
  public static void main(String args[]){
     Stack stack1=new Stack();
     String z="a+b*c/d-e";
     char[] z1=z.toCharArray();
     for(int i=0;i<z.length;i++){
         if(z1[i]=='[abcd]')
            stack1.push(z1[i]);
         if(z1[i]=='/')
            System.out.print("/"+z1[i+1]+z1[i-1]);
      }
  }
}