class Test{
  public static void main(String args[]){
     int arr[]={6,8,-9,-7,4,-3,-5,11};
     int start=0;
     int end=arr.length-1;
     int temp;
     while(start<end){
       if(arr[start]>0 && arr[end]<0){
         temp=arr[end];
         arr[end]=arr[start];
         arr[start]=temp;
         start++;
         end--;
       }
       if(arr[start]<0 && arr[end]<0){
         start++;
       }
       if(arr[start]>0 && arr[end]>0){
         end--;
       }
       if(arr[start]<0 && arr[end]>0){
         start++;
         end--;
       }

     } 
     for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");  
      }
  }
}