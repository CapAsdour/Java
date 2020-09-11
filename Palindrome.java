class Palindrome
{
  public static void main(String args[])
  {  
     int flag = 1;
     String arr=args[0];
     int n=arr.length();
     for(int i=0;i<n;i++)
     {
       if(arr.charAt(i)!=arr.charAt((n-1)-i)){flag=0;} 
     } 
     if(flag==1){System.out.println("Palindrome");}
     else{System.out.println("Not Palindrome");}
  }
}