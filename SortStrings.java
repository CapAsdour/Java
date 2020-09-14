class SortStrings
{
  public static void main(String args[])
  {
    int i,j;
    String temp;
    int l=args.length;
    String[] str = new String[l];
    for(i=0;i<l;i++)
    {
      str[i]=args[i];
    }
    System.out.println("\nSorted Strings are :-");
    for(i=0;i<l;i++)
    {

      for(j=i+1;j<l;j++)
      {
        if(str[j].compareTo(str[i])<0)
        {
          temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
      System.out.print(str[i]+" ");
    }
  }
}