import Maths.SumPack;
class SamPack
{
	int a,b;
	SamPack(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		new SumPack().sum(a,b);
		new SumPack().sub(a,b);
	}
	public static void main(String s[])
	{
		new SamPack(12,4).disp();
	}
}
