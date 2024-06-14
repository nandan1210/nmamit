class Test{
  public static void main(String args[]){
    String z="welcome to my class";
    String[] z1=z.split(" ");
    int start=0;
    int end=z1.length-1;
    String temp;
    while(start<end){
       temp=z1[end];
       z1[end]=z1[start];
       z1[start]=temp;
       start++;
       end--;
     }
    for(int i=0;i<z1.length;i++){
    System.out.print(z1[i]+" ");
  }
}
}
