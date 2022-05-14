class A{
	A getData(){
		System.out.println("This is a A class");
		return this;
	}
}

class B extends A{
	B getData(){
		System.out.println("This is a B class");
		return this;
	}
}

class CovarientReturnType{
	public static void main(String args[]){
		A a = new A();
		a.getData();
		B b = new B();
		b.getData();
	}

}