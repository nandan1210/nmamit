class Test{
  public static void main(String args[]){
    int arr[]={4,6,7,8,5};
    int n=arr.length;
    int temp=arr[n-1];
    for(int i=n-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=temp;
    for(int i=0;i<n;i++){
       System.out.print(arr[i]+" ");  
      }
  }
}
---------------------------------------------------------------------
Find The Occurence Of An Element In An Array
arr=[3,4,3,5,2,3,4,2,3]
input     3   2    5    7

output    4   2    1    0



