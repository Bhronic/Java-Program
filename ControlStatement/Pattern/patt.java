class patt
{
	public static void main(String args[])
	{
		int val = 5;
		for(int i=1;i<=val;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<2;k++)
			{
				System.out.print(" * ");
			}
			for(int l=i;l<=val-1;l++)
			{
				System.out.print("  ");
			}
			for(int l=i;l<val-1;l++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<2;k++)
			{   if(i!=val){
				System.out.print("* ");
			}
			}
		System.out.println();
		}
		
		for(int i=1;i<=val-1;i++)
		{
			for(int j=i;j<val;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<2;k++)
			{
				System.out.print(" * ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("  ");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}