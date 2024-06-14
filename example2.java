interface Sample{
   public void first();
   public void second();
} 
class Display implements Sample{
   public void first(){
     System.out.println("First Method Implemented");
    }
   public void second(){
     System.out.println("Second Method Implemented");
   }
 }
class Test{
  public static void main(String args[]){
    Display obj=new Display();
    obj.first();
    obj.second();
  }
}