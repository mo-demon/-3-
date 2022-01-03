package 第4次作业;
public class Cylinder extends Circle
{
	public static double h;//类成员变量
	@SuppressWarnings("static-access")
	Cylinder(double x,double y,double r,double h)
	{
		super(h, h, h);//引用父类的属性
		this.h=h;
	}
	@SuppressWarnings("static-access")
	public void setH(double h)
	{
		this.h=h;//引用子类的属性
	}
	public double getH()
	{
		return h;
	}
	public double area()
	{
		return perimeter()*h+super.area()*2;
	}
	public double perimeter() {
		// TODO 自动生成的方法存根
		return 0;
	}
	public double volume()
	{
		return super.area()*h;//计算体积
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Cylinder cylinder=new Cylinder(1,1,4,8);
		cylinder.show();
		System.out.println(",Height="+cylinder.getH());
		System.out.println("Area="+cylinder.area());
		System.out.println("Volume="+cylinder.volume());
	}
	public void show() {
		// TODO 自动生成的方法存根
		
	}
}