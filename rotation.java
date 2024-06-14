class Test{
  public static void main(String args[]){
    int[] arr={7,8,9,5,6,4};
    int n=arr.length;
    int last=arr[n-1];
    for(int i=n;i<0;i++){
       arr[i]=arr[i-1];
     }
    arr[0]=last;
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}