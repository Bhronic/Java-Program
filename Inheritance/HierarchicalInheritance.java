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

class Toyota extends Car{
	void name(){
		System.out.println();
		System.out.println("Toyota car model name : ");
		System.out.println("Toyota Camry \nToyota Rav4 \nToyota Prius \nand many more");
	}
}

class Hundai extends Car{
	void name(){
		System.out.println();
		System.out.println("Hundai car model name : ");
		System.out.println("Hyundai Santamo \nHyundai Aero \nHyundai Sonata Embera \nHyundai e-Mighty \nand many more");
	}
}

class HierarchicalInheritance{
	public static void main(String args[]){
		Toyota t = new Toyota();
		t.type();
		t.show();
		t.name();
		
		Hundai h = new Hundai();
		h.name();
	}
}