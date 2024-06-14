class Test{
  public static void main(String args[]){
    int[] prices={50,60,70,65,80,90,100};
    int span=1;
    System.out.print(span+" ");
    for(int i=1;i<prices.length;i++){
       for(int j=i-1;j>=0;j--){
         if(prices[i]<prices[j])
             break;
         else
             span++;
       }
     System.out.print(span+" ");
     span=1;
    }
  }
}