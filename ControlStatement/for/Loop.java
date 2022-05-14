class Loop
{
	public static void main(String args[])
	{
		int n =  Integer.parseInt(args[0]);

		System.out.println("One Number = " +n);
		for(int i=0;i<=5;i++)
		{
			System.out.println(n +" * " +i +" = "+ (n*i));
		}
	}
}