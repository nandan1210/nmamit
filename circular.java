class Test{
  public static void main(String args[]){
    String z="this student turns slight";
    String[] z1=z.split(" "); 
    int flag=0; 
    int first=0;
    int second=1;
    int last=z1.length-1;
    char[] arr=z1.toCharArray();
    if(z1[last].endsWith(arr[0].toString)){
         while(second<=last){}
     }
    else
     System.out.println("Not Circular..."); 
         }
}