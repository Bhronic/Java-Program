interface I1{
	void display();
}

interface I2{
	void show();
}

class MultipleInterface implements I1,I2{
	public void display(){
		System.out.println("This is the I1 Interface");
	}
	
	public void show(){
		System.out.println("This is the I2 Interface");
	}
	
	public static void main(String args[]){
		MultipleInterface mi = new MultipleInterface();
		mi.display();
		mi.show();
	}
}