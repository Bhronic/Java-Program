interface I1{
	void display();
}

class InterfactSimpleExample implements I1{
	public void display(){
		System.out.println("Interface Simple Program");
	}
	public static void main(String args[]){
		InterfactSimpleExample i = new InterfactSimpleExample();
		i.display();
	}
}