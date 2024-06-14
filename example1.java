abstract class Student{
  void display(){
   System.out.println("This Is The First Method Of Abstract Class");
  }
 //abstract method
  abstract void present();
}
class First extends Student{ 
   void present(){
     System.out.println("Abstract Method Implemented");
   }
}
class Test{
  public static void main(String args[]){
     First obj=new First();
     obj.display();
     obj.present();
   }
}