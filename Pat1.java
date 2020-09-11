class Pat1
{
  public static void main(String args[])
  { 
    int count=1;
    for(int i=1;i<=4;i++)
    { if(i%2!=0){count=1;}
      for(int j=1;j<=i;j++)
      {
       if(count%2!=0){System.out.print(1);}
       else{System.out.print(0);}
       count=count+1;
      }
      System.out.println("");
    }
  }
}