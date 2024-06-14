class Test{
  public static void main(String args[]){
     double[] arr={7.0,7.15,7.45,8.10,8.15,9.0,9.05,9.25};
     int max=0;   
     double[] dept={7.05,7.50,7.55,8.39,8.55,9.40,9.35,9.30};
     int count=1;
     for(int i=0;i<arr.length;i++){
        for(int j=i-1;j>=0;j--){
          if(dept[j]<arr[i])
            break;
          else
            count++;
        }
        if(count>max)
         max=count;
        count=1;
        }
       System.out.println("Minimum Platforms Required:"+max);
   }
}