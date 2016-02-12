class SimpleQueue
{
	int a[],f,r,max;
	SimpleQueue(int max)
	{
		this.max=max;
		a=new int[max];
		f=r=0;
	}
	boolean isEmpty()
	{
		if(f==r)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(r==max-1)
			return true;
		else
			return false;
	}
	void insert(int x)
	{
		if(!isFull())
		{
			a[++r]=a[r-1];
			a[r-1]=x;
		}
		else
			System.out.println("Full");
	}
	void delete()
	{
		if(!isEmpty())
			a[r--]=0;
		else
			System.out.println("Empty");
	}
	void peek()
	{
		System.out.println(a[r]);
	}
	void print()
	{
		for(int i=0;i<max;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String []as)
	{
		SimpleQueue ab= new SimpleQueue(4);
		ab.delete();
		ab.insert(2);
		ab.insert(3);
		ab.print();
		ab.peek();
		ab.delete();
		ab.print();
	}
}
			
		
	
