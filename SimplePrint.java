class SimplePrint extends Thread
{
	public static void main(String []as)
	{
		int number=Thread.MAX_PRIORITY;
		System.out.println(number+" "+(number-1)+" "+(number+1)+" "+Integer.toBinaryString(19)+" "+("bananas".compareTo ("banana"))+" ");
	}
}
