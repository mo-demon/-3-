package ��4����ҵ;
public class Cylinder extends Circle
{
	public static double h;//���Ա����
	@SuppressWarnings("static-access")
	Cylinder(double x,double y,double r,double h)
	{
		super(h, h, h);//���ø��������
		this.h=h;
	}
	@SuppressWarnings("static-access")
	public void setH(double h)
	{
		this.h=h;//�������������
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
		// TODO �Զ����ɵķ������
		return 0;
	}
	public double volume()
	{
		return super.area()*h;//�������
	}
	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
		Cylinder cylinder=new Cylinder(1,1,4,8);
		cylinder.show();
		System.out.println(",Height="+cylinder.getH());
		System.out.println("Area="+cylinder.area());
		System.out.println("Volume="+cylinder.volume());
	}
	public void show() {
		// TODO �Զ����ɵķ������
		
	}
}