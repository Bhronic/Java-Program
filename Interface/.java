interface I1{
	int a = 10;
	void display();
}

interface I2 extends I1{
	int b = 120;
	void show();
}

class InterfaceInheritance implements I2{
	public void display(){
		System.out.println("Value of A = "+a);
	}
	
	public void show(){
		System.out.println("Value of B = "+b);
	}
	
	public static void main(String args[]){
		InterfaceInheritance ii = new InterfaceInheritance();
		ii.display();
		ii.show();
	}
}