class Pon
{
  public static void main(String args[])
  { 
    int m=0;
    int n=Integer.parseInt(args[0]);
    for(int i=2;i<n;i++)
    {
      if(n%i==0){m=1;}
    }
    if(m==1){System.out.println("Not Prime");}
    else{System.out.println("Prime");}
  }
}