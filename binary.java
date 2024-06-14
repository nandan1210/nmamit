import java.util.Scanner;
class Test{
  public static void main(String args[]){
    int[] arr={5,8,9,13,16,25};
    int left=0;
    int right=arr.length-1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Element:");
    int el=sc.nextInt();
    int flag=0;
    int pivot;
    while(left<=right){
          int n=right-left+1;
          if(n%2==0)
            pivot=n/2;
          else
            pivot=(n-1)/2;
          if(el==arr[pivot]){
            System.out.println("Position="+(pivot+1));
            flag=1;
            break;
            }
          if(el>arr[pivot])
            left=pivot+1;
          if(el<arr[pivot])
            right=pivot-1;
          }
      if(flag==0)
        System.out.println("Element Not Found....");
  }
}