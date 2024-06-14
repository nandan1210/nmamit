import java.util.Collection;
LinkedList l1=new LinkedList();
l1.add(10);
l1.add(20);
l1.add(30);
l1.add(40);
l1.add(50);
//Travering A Linked List
Iterator itr=l1.iterator();
while(itr.hasNext()){
   System.out.println(itr.next());
}


