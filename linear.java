import java.util.Scanner;
class Test{
  public static void main(String args[]){
      int[] arr={5,8,13,18,15,9};
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Element:");
      int el=sc.nextInt();
      int i;
      for (i=0;i<arr.length;i++){
           if(arr[i]==el){
              System.out.println("Position of element"+(i+1));
              break;
              }
       }
     if(i==arr.length)
       System.out.println("Element No Found...");
   }
}