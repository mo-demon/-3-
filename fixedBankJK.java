package 第4次作业;
class fixedBankJK implements BankJK//继承接口
{
	private float saving;
	private double sum;
	fixedBankJK(float i)
	{
		saving=i;
		count();
	}
	public void count()
	{
		sum=saving+(saving*Bank.fixedRate*0.8);
	}
	public void show()
	{
		System.out.println("With fixedRate,sum="+sum);
	}
}