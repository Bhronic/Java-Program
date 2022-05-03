class ResolveExceptionInCatch{
	public static void main(String args[]){
			int i = 10 , j = 0 , data;
			
			try{
				data = i/j;
			}
			
			catch(Exception e){
				System.out.println(i/(j+2));
			}
	}
}
			
