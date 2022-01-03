package 第4次作业;

public class Circle
{
	public static double x;
	public static double y;
	public static double r;
	Circle(double x,double y,double r)
	{
		Circle.x=x;
		Circle.y=y;
		Circle.r=r;
	}
	public void setX(double x)
	{
		Circle.x=x;
	}
	public void setY(double y)
	{
		Circle.y=y;
	}
	public void setR(double r)
	{
		Circle.r=r;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public double getR()
	{
		return r;
	}
	public double area()
	{
		return r*r*3.1416;
	}
	public double perimeter()
	{
		return 2*r*3.1416;
	}
	public void show()
	{
		System.out.print("x="+x+",y="+y+",Radius="+r);
	}
}
