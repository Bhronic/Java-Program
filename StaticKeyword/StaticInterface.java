interface I1{
	static void show(){
		System.out.println("After java 9 , static method can be written with body in interface");
	}
	
	
	void display();
}

class StaticInterface implements I1{
	public void display(){
		System.out.println("This the bydefault abstrct method");
	}
	
	public static void main(String args[]){
		DefaultInterface di = new DefaultInterface();
		I1.show();
		di.display();
	}
}