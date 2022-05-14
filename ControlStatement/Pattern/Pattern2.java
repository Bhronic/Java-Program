class Pattern2
{
	public static void main(String args[])
	{
	int n=5;
	for(int i=1;i<=n;i++)
		{
			int k=1;
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			 for(k=1;k<i;k++)
			{
			 System.out.print(k +" ");
			}
			for(int l=1;l<=i;l++)
			{
			 System.out.print(k-- +" ");
			}	
			System.out.println();
		}

	}
}
