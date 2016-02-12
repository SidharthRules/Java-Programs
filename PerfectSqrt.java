import java.util.Scanner;
class PerfectSqrt
{
	public static void main(String []as)
	{
		int a,i;
		a= new Scanner(System.in).nextInt();
		for(i=1;i<a/i;i++)
			if(i*i==a)
				break;
		System.out.println("Square Root is : "+i);
	}
}
