
class Test{   
  public static void main(String args[]){
     String z="welcome";
     char[] arr=z.toCharArray();
     int start=0;
     char temp;
     int end=arr.length-1;
     while(start<end){
       temp=arr[end];
       arr[end]=arr[start];
       arr[start]=temp;
       start++;
       end--;
      }
    System.out.println(arr);
   }
}