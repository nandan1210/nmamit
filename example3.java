interface Vehicle{
  public void type();
}
interface Car extends Vehicle{
  public void price();
}
class Ford implements Car{
  public void type(){
    System.out.println("Type:Four Wheeler");
  }
  public void price(){
    System.out.println("Price:Rs 12 Lacks");
  }
}
class Test{
  public static void main(String args[]){
    Ford obj=new Ford();
    obj.type();
    obj.price();
  }
}