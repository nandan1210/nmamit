import java.util.*;
class Test{
  public static void main(String args[]){
    String z1="abcd";
    String z2="pqrs";
    int flag=0;
    if(z1.length()==z2.length()){
       HashMap map1=new HashMap(); 
       for(int i=0;i<z1.length();i++){
          map1.put(z1.charAt(i),z2.charAt(i));
        }
       for(int i=0;i<z1.length();i++){
          if((map1.containsKey(z1.charAt(i))==false)||(map1.containsValue(z2.charAt(i))==false)){
               System.out.println("Non Isomorphic");
               flag=1;
               break;
          } 
      } 
       if (flag==0)
         System.out.println("Isomorphic Strings");
     }
    else
     System.out.println("Non Isomorphic");
  }
}