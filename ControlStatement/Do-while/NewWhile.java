class NewWhile{
	public static void main(String args[])
	{
	
	int i=1;
	int n=1;
	int tableNo = 6;
		System.out.println(" table of "+tableNo);
	while(n<=10){
		System.out.println(tableNo+" * "+n+" = "+(tableNo*n));
		n++;
	}
	
		System.out.println(" pattren 2 ");
	while(i<=5) //while loop
		{
			int k=1;
			int j=i;
			int l=1;
			while(j<=5)
			{
				System.out.print("  ");
				j++;
			}
			while(k<i)
			{
			 System.out.print(k +" ");
			 k++;
			}
			while(l<=i)
			{
			 System.out.print(k-- +" ");
			 l++;
			}	
			System.out.println();
			i++;
		}
		
		int x=1;
		System.out.println("using do while loop ");
		
		do{
			System.out.println(tableNo+" * "+x+" = "+(tableNo*x));
		x++;
		}while(x<=10);

	}
}

// *       *
 // *     *
  // *   * 
    // *
  // *	 *
 // *	  *
// *	   *  