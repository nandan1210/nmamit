class Test{
  public static void main(String args[]){
     int[] arr={-7,9,8,-5,-6,12,13,-16,15,24,-14,-21};
     int start=0;
     int temp;
     int end=arr.length-1; 
     while(start<end){
       if(arr[start]<0 && arr[end]<0){
           start++;
        }
       else if(arr[start]>0 && arr[end]<0){
           temp=arr[end];
           arr[end]=arr[start];
           arr[start]=temp;
           start++;
           end--;
         }
        else if(arr[start]>0 && arr[end]>0){
           start++;
         }
        else{
          start++;
          end--;
       }
     }
     start=0;
     end=arr.length-1;
     while(start<end){
      if(start%2==0){
       temp=arr[end];
       arr[end]=arr[start];
       arr[start]=temp;
       }
       start++;
       end--;
       
    } 
     for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
     }
  }
}