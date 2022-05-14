class Num1{
	int n = 100;
}

class Num2 extends Num1{
	int n =200;
	
	void display(){
		System.out.println("N2 Value = " +n);
		System.out.println("N1 Value = " +super.n);
	}
}

class SuperVariableExample{
	public static void main(String args[]){
		Num2 se = new Num2();
		se.display();
	}
}