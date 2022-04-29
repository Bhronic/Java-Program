interface Car{
	void running(); //this mehode must be override.
	
	// default and static method with boday we can define.
	default void printable(){  // default method
		System.out.println("default methode call..");
	};
	static int cube(int x){return x*x*x;}  // static method
	
}

interface Type extends Car{  // interface to interface "extends"
	void carType();
	void running();
}

class TestInterface implements Type{ // class to interface "implements"
	public void running(){
		System.out.println("Honda is running...........");
	}
	
	public void carType(){
		System.out.println("car type is XUV...........");
	}
}

class Honda_interface{
	
	public static void main(String args[]){
		TestInterface h = new TestInterface();
		h.running();
		h.carType();
		h.printable();  // call default method.
		
		System.out.println(Car.cube(3));  //call static method
		
		
	}

}
