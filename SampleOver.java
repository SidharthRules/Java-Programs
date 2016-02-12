class A
{
	void disp()
	{
		System.out.println("I'm in Class A");
	}
}
class B extends A
{
	void disp()
	{
		super.disp();
		System.out.println("I'm in Class B");
	}
}
class SampleOver
{
	public static void main(String []ard)
	{
		B ob = new B();
		ob.disp();
	}
}
