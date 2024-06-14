import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your input:");
     int n=sc.nextInt();
     int length=2*n-1;
     int min=0;
      for(int i=0;i<length;i++){
         for(int j=0;j<length;j++){
           min=(i<j)?i:j;
           min=(min<length-i)?min:length-i-1;
           min=(min<length-j-1)?min:length-j-1;
           System.out.print(n-min);
          }
          System.out.println("");
       }
   }
}