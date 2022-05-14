class Constructor1{
	Constructor1(){
		System.out.println("This is Parent class Cnstructor");
	}
	
	Constructor1(int a){
		System.out.println("This is a parent class A value = " +a);
	}
}

class Constructor2 extends Constructor1{
	Constructor2(int a, int b ){
		super(15);
		System.out.println("This is a child class A value = " +a);
		System.out.println("This is a child class B value = " +b);

	}
	
	Constructor2(){
		//super();
		System.out.println("This is child class Cnstructor")
		
	}
}

class SuperConstructorExample{
	public static void main(String args[]){
		Constructor2 sc = new Constructor2(7,4);
		//Constructor2 sc1 = new Constructor2();
	}
}


