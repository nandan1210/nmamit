class Display{
  void show(){
    System.out.println("Hello");
  }
  Display(){
     System.out.println("Constructor Called...");
  }
}
class Student{
  String name;
  int rollno;
  Student(String name,int rollno){
    this.name=name;
    this.rollno=rollno;
  }
}
class Test{
  public static void main(String args[]){
      Display obj=new Display();
      obj.show();
      Student std1=new Student("Rishi",101);
      Student std2=new Student("Rohit",102);
      System.out.println(std1.rollno);
      System.out.println(std1.name);
      System.out.println(std2.rollno);
      System.out.println(std2.name);

  }
}