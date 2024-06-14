import java.util.Scanner;
class Test{
   public static void main(String args[]){
     int arr[]={3,5,6,3,2,4,5,3};
     int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter an element");
     int el=sc.nextInt();
     for(int i=0;i<arr.length;i++){
        if(el==arr[i])
          count++;
      }
     System.out.println("occurrence="+count);
   }
}