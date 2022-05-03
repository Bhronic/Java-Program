class ExceptionUsingDiffException{
	public static void main(String arg[]){
		try{
			int a = 50/0;
		}
		//Using different Exception 
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("Continue to code");	
	}
}
