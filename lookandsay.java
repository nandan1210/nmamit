class Test{
  public static void main(String args[]){
      String z="1";
      String temp="";
      int n=5;
      int j;
      int count=1;
      for(int i=1;i<n;i++){
        char[] z1=z.toCharArray();
        for(j=1;j<z1.length;j++){
           if(z1[j]==z1[j-1]){
             count++;
           }
           else{
             temp=temp+count+z1[j-1];
             count=0;
            }
          }
          z=temp;
          temp="";
          System.out.print(z);
      }
   }
}