class pattern{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)  //Increase payramid
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++)   // Decrease payramid
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++) // Decrease payramid with space
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) //Increase payramid with *
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();


		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)  // int j=1;j<i;j++
			{
				System.out.print("* ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("* ");
			}
		
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
	

		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
						
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
