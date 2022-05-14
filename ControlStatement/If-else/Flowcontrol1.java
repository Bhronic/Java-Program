class Flowcontrol1{
	public static void main(String args[]){
		int a = 10;
		String city = "Vadodara";

		//if Statement//
		if(a <= 10 )
			{
				System.out.println("Value of a is =" +a);
			}

		//if-else statement//
		if(a == 9)
			{
				System.out.println("Value is not match");
			}
		else
			{
				System.out.println("Value is match");
			}

			//ladder if-else statemnt//

		int p = 56;
		if( p >= 0 && p <= 35)
			{
				System.out.println("poor marks");
			}
		else if( p >= 35 && p <= 60)
			{
				System.out.println("Not so good marks");
			}
		else if( p >= 60 && p <= 90)
			{
				System.out.println("Good marks");
			}
		else
			{
				System.out.println("Excellent marks");
			}
	
		String name = "shruti";
		if( a == 0 && name == "palak")
			{
				System.out.println("Palak has 0 apple");
			}
		else if( a != 56 && name == "shruti")
			{
				System.out.println("Shruti has 60 apples");
			}
		else if(a >= 45 && name == "shruti")
			{
				System.out.println("Shruti has 80 apples");
			}
		else
			{
				System.out.println(" No one has nothing");
			}
	

		// Nested if statement//
			String color = "Green";
			if(color == "Green")
				{
				if(color == "yellow")
					{
						System.out.println("color is yellow");
					}
				if(color != "Green")
					{
						System.out.println("Color is not green");
					}
				if(color == "Green")
					{
						System.out.println("color is Green");
					}
				}
				else
					{
						System.out.println("color is not match");
					}

	}		
}