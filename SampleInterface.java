interface Sum
{
	public void sum(int a, int b);
	public void sub(int a,int b);
}
class SampleInterface implements Sum
{
	public void sum(int a, int b)
	{
		System.out.println("Sum is "+(a+b));
	}
	public void sub(int a, int b)
	{
	}
	public static void main(String p[])
	{
		new SampleInterface().sum(3,4);
	}
}
