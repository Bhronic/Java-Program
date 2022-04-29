class Data{
	
	final int number = 10;
	
	Data(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	Data(){
	}
	/**
	public void setNumber(int n){
	number = n;
	}*/
	
	public int getNumber(){
		return number;
	}
}

class FinalEx1{

	public static void main(String a[]){
		final Data d = new Data(); //final keyword with object
		//d = new Data(); 
		//d.setNumber(6);
		
		System.out.println("number = "+d.getNumber());
		
	}
}