package ��4����ҵ;
class fixedBankJK implements BankJK//�̳нӿ�
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