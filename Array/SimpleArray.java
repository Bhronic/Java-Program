class SimpleArray{
	public static void main(String args[]){
		int a[] = new int[5]; //Declare and instantia
		
		//Initialize
		a[0] = 67;
		a[1] = 23;
		a[2] = 37;
		a[3] = 82;
		a[4] = 40;
		
		for(int i=0 ; i<a.length; i++){
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}