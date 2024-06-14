class Test{
   static boolean isAlpha(char c){
    if(c>='a' && c<='z')
      return true;
    else
      return false;
   }
   static boolean isDigit(char c){
    if(c>='0' && c<='9')
      return true;
    else
      return false;
   }
   static boolean isOperator(char c){
     return (!isAlpha(c)) && (!isDigit(c));
   }


   static int getPriority(char c){
     if(c=='-'|c=='+')
       return 1;
     else if(c=='*'|c=='/')
       return 2;
     else
       return 0;
   }
   static String reverse(char str[],int start,int end){
     char temp;
     while(start<end){
      temp=str[start];
      str[start]=str[end];
      str[end]=temp;
      start++;
      end--;
     }
      return String.valueOf(str);
   }
   static String convert(char infix[]){
    int l=infix.length;
    String infix1=reverse(infix,0,n-1);
    infix=infix1.toCharArray();
    for(int i=0;i<n;i++){
       if(infix[i]=='('){
          infix[i]=')';
          i++;
        }
       else if(infix[i]==')'){
          infix[i]='(';
          i++;
       }
        }
       prefix=reverse(prefix.toCharArray());
    }
    
   }
   public static void main(String args[]){
     String z="(a+b*c/d-e)";
     char[] z1=z.toCharArray();
     System.out.println(convert(z1));
           }
}