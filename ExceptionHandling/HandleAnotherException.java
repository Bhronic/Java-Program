class HandleUncheckedException{
	public static void main(String arg[]){
		try{
			int[] b = {10,68,56};
			System.out.println(b[5]);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("Continue to code");	
	}
}



