class pattern1
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("1 ");
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
				System.out.print("1 ");
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println();
		System.out.println();
	
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
	
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1,p=5;i<=n;i++,p--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1,p=5;i<=n;i++,p--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1,p=0;i<=n;i++,p+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1,p=0;i<=n;i++,p+=2)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+" ");
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
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}
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
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}			}
						
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
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}			}
			for(int j=i;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	
		int p=1;
		for(int i=1;i<n;i++,p++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(p+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
						
			System.out.println();
		}
		for(int i=1;i<=n;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(p+" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
	
	for(int i=1,q=1;i<n;i++,q++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(q+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(q+" ");
			}
						
			System.out.println();
		}
		for(int i=1,q=5;i<=n;i++,q--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(q+" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(q+" ");
			}
			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for(int i=1;i<=n;i++)
		{
			int q = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(q++ +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			int q=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(q++ +" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			int q = 5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(q-- +" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1,k=n;i<=n;i++,k--)
		{
			int q=k;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(q-- +" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			int q=1;
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(q++ +" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(q-- +" ");
			}	
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int r=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(r++ +" ");
			}
			System.out.println();
		}
	}
}