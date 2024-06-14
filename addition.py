class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner();
    System.out.println("enter first number:");
    int x=sc.nextInt();
    System.out.println("enter second number:");
    int y=sc.nextInt();
    if(x==0|y==0)
      throw Exception();
    else
      System.out.println("sum="+(x+y));
  }
}