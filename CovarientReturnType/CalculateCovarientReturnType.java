class Sum {
	int a, b;
	void getData(int a , int b){
		this.a = a;
		this.b = b;
	}
	
	Sum calculate(){
		int c = a+b;
		System.out.println("Addition = "+c);
		return this;
	}
}

class Sub {
	int a, b;
	void getData(int a , int b){
		this.a = a;
		this.b = b;
	}
	
	Sub calculate(){
		int c = a-b;
		System.out.println("Addition = "+c);
		return this;
	}
}

class CalculateCovarientReturnType{
	public static void main(String argd[]){
		Sum a = new Sum();
		a.getData(5,7);
		a.calculate();
		
		Sub m = new Sub();
		m.getData(6,9);
		m.calculate();
	}
}