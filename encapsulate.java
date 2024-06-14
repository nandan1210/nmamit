class Student{
  //Encapsulated Data
  private int rollno=101;
  String name="Rohan";
  //getter method
  void getRollno(){
    System.out.println(rollno);
  }
  //setter method
  void setRollno(){
    rollno=102;
  }
}
class Test{
  public static void main(String args[]){
      Student std=new Student();
      std.getRollno();
      std.setRollno();
      std.getRollno();

   }
}