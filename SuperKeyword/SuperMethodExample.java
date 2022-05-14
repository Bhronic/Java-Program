class Method1{
	void display(){
		System.out.println("This is parent class method");		
	}
}

class Method2 extends Method1{
	void display(){
		super.display();
		System.out.println("This is child class method");		
	}
}

class SuperMethodExample{
	public static void main(String args[]){
		Method2 sm = new Method2();
		sm.display();
	}
}