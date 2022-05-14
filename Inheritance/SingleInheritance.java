class Vehicle{
	void type(){
	System.out.println("There ar different types of Vehicle");
	}
}

class Car extends Vehicle{
	void show(){
		System.out.println("There are 5 types of Car");
	}
}

class SingleInheritance{
	public static void main(String args[]){
		Car c = new Car();
		c.type();
		c.show();
	}
}