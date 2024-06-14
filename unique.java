class Test{
   public static void main(String args[]){
     char[] z={'M','U','M','B','A','I'};
     int i,j;
     int flag=0;
     for(i=0;i<z.length;i++){
        for(j=0;j<z.length;j++){
           if (z[i]==z[j] && i!=j)         
              flag=1;
              break;
         }
     }
}
}