class ExceptionHandling2{
	public static void main(String args[]){
		try{
			int a = 50/0;
			
			System.out.println("Continue to code");
		}
		catch(ArithmeticException a){
			System.out.println(a);
		}
	}
}
