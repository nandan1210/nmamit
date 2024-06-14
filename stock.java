class Test{
  public static void main(String args[]){
      int[] prices={70,60,80,100,75,90};
      int n=prices.length;
      int count=1;
      int[] span=new int[n];
      for(int i=0;i<n;i++){
         for(int j=i-1;j>=0;j--){
              if(prices[j]>prices[i])
                 break;
              else
                 count++;
           }
           span[i]=count;
           count=1;
       }
      for(int i=0;i<n;i++){
        System.out.print(span[i]+" ");
      }
   }
}