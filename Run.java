class Display
{
int max1(int a, int b)
{
if(a>b)
{return a;}
else
{return b;}
}
void display(int a,int b)
{
System.out.println(max1(a,b));
}
}
class Run
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
Display dis1 =new Display();
dis1.display(i,j);
}
}