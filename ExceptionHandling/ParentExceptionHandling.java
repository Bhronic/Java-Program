class ParentExceptionHandling{
	public static void main(String args[]){
		try{
			int a = 50/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Continue to code");	
	}
}

