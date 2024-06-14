class Test{
   public static void main(String args[]){
      String z="this system matters slight"
      String[] z1=z.split(" ");
      String prev,next;
      int n=z1.length;
      int flag=0;
      for(int i=0;i<n-1;i++){
         prev=z1[i];
         next=z1[i+1]
         char[] a=prev.toCharArray;
         char[] b=next.toCharArray;
         if(a[a.length-1]!=b[0]){
           flag=1;
           System.out.println("Not A Circular Sequence");
           break;   
          }
       }
        if(flag==0){
           System.out.println("Is A Circular Sequence...")
        }
   }
}