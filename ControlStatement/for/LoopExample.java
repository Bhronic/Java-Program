class LoopExample{

	public static void main(String args[]){
		int a = 10;
		//postfix a++ => a=10 => a+1 (increamnet)
		//prefix  ++a => a+1 => a=a;
		
		System.out.println("postfix = "+ (a++)); //a=10 => 10+1=11
		System.out.println("prefix = "+ (++a)); // 11+1= 12 => a=12
		System.out.println("prefix = "+ (a+=2));  // a=a+2; => 12+2 = 14
		System.out.println("prefix = "+ (a*=7));
	  int n =  Integer.parseInt(args[0]);
	  
	  System.out.println("===== Table of "+n);
	  for(int i=1;i<=10;i++){
	  System.out.println(n +" * "+i+" = "+ (n*i));
	  }
	  
	  for(int i=0;i<=2;i++){
	   for(int j=0;j<=2;j++){
			System.out.print(i+""+j+"    ");
	   }
	   System.out.println("");
	  }
	}
	
}

1) pattern
*
* *
* * *
* * * *
* * * * * 
2) 
1
1 2 
1 2 3
1 2 3 4 
1 2 3 4 5