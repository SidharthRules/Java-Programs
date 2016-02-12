import java.util.Scanner;
class MatCount
{
	public static void main(String []as)
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of N: ");
		n=sc.nextInt();
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int c;
			System.out.println(a[i]);
			
			//if(c=Integer.ParseInt(a[i])
		}		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
