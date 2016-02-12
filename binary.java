import java.util.*;

public class binary
{
	public static void main(String arg[])
	{
		System.out.print("Give the decimal Number:  ");
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long a[] = new long[64];
		int i,j,k;
		for(i = 0; i<64; i++)
		{
			a[63-i] = (n%2);
			n=n/2;
		}
		for(k=0; k<64; k++)
		{
			if(a[k]==1)
			break;
		}
		System.out.println("Number of bit" +(64-k));
		for(int l=k; l>=k&&l<64; l++)
		{
			System.out.print(a[l]);
		}
		/*System.out.println("  ");	
		for(j=0; j<64; j++)
		{
			System.out.print(a[j]);
		}*/
	}
}
