class ExceptionInCatch{
	public static void main(String args[]){
		try{
			int a = 10/0;
		}
		catch(Exception e){
			int a = 10/0;
		}
		System.out.println("Continue to code");
	}
}

