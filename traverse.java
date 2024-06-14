class Test{
   public static void main(String args[]){
     int[] arr={4,7,8,9,5,3};
     int[] reverse=new int[6];
     int n=arr.length;
     for(int i=n-1;i>=0;i--){
        reverse[n-i-1]=arr[i];        
      }
     for(int i=0;i<n;i++){
        System.out.print(reverse[i]+" ");
      }
   }
}