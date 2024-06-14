import java.util.Vector;
import java.util.Iterator;
class Test{
public static void main(String args[]){
Vector v1=new Vector();
 v1.add(10);
 v1.add(20);
 v1.add(30);
 v1.add(40);
 v1.add(50);
 //Travering A Linked List
 Iterator itr=v1.iterator();
 while(itr.hasNext()){
   System.out.println(itr.next());
}
}
}


