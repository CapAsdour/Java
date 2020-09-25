class Rectangle
{
  int len;
  int br;
  Rectangle(int i,int j)
  {
    len=i;
    br=j;
  }
  int rectPerimeter()
  {
    return (2*(len+br));
  }
  int rectArea()
  {
    return (len*br);
  }
}
class Circle
{
  float r;
  Circle(float y)
  {
    r=y;
  }
  float cirPerimeter()
  {
    return ((2*22*r)/7);
  }
  float cirArea()
  {
    return ((22*r*r)/7);
  }
}
class Square
{
  int a;
  Square(int x)
  {
    a=x;
  }
  int sqrPerimeter()
  {
    return (4*a);
  }
  int sqrArea()
  {
    return (a*a);
  }
}
class Shapes
{
  public static void main(String args[])
  {
    Rectangle rect1 = new Rectangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]));   
    Circle cir1 = new Circle(Float.parseFloat(args[2]));
    Square sqr1 = new Square(Integer.parseInt(args[3]));
    System.out.println(" Perimeter and Area of Rectange is "+rect1.rectPerimeter()+" and "+rect1.rectArea());
    System.out.println(" Perimeter and Area of Circle is "+cir1.cirPerimeter()+" and "+cir1.cirArea());
    System.out.println(" Perimeter and Area of Square is "+sqr1.sqrPerimeter()+" and "+sqr1.sqrArea());
  }
}