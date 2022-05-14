class Toyota{
	void name(){
		System.out.println();
		System.out.println("Toyota car model name : ");
		System.out.println("Toyota Camry \nToyota Rav4 \nToyota Prius \nand many more");
	}
}

class Hundai{
	void name1(){
		System.out.println();
		System.out.println("Hundai car model name : ");
		System.out.println("Hyundai Santamo \nHyundai Aero \nHyundai Sonata Embera \nHyundai e-Mighty \nand many more");
	}
}

class Car extends Toyota , Hundai{
	void show(){
		System.out.println("There are 5 types of Car");
	}
}


class MultipleInheritance{
	public static void main(String args[]){
		car c= new car();
		c.show();
		c.name();
		c.name1();
	}
}