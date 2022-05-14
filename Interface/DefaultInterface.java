interface I1{
	default void show(){
		System.out.println("After java 8 , default method can be written with body in interface");
	}

	void display();
}

class DefaultInterface implements I1{
	public void display(){
		System.out.println("This the bydefault abstrct method");
	}
	
	public static void main(String args[]){
		DefaultInterface di = new DefaultInterface();
		di.show();
		di.display();
	}
}