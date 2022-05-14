class Method{
	void display(){
	System.out.println("This is a Parent class method");
	}
}

class Method1 extends Method{
	void display(){
	System.out.println("This is a child class method");
	}
}

class MethodOverridingExample{
	public static void main(String args[]){
		Method1 mo = new Method1();
		mo.display();
	}
}