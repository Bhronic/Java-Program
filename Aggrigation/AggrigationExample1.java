 class Car{
	String carname;
	String colour;	
	String carlicenceno;
	
	Car(String carname, String colour, String carlicenceno){
		this.carname = carname;
		this.colour = colour;
		this.carlicenceno = carlicenceno;
	}
}

class Bike {
	String bikename;
	String bikelicenceno;
  
	Bike(String bikename, String bikelicenceno) {
		this.bikename = bikename;
		this.bikelicenceno = bikelicenceno;
	}
}
 
 class Employee{
	 int id;
	 String ename;
	 Car car;
	 Bike bike;
	 
	 Employee(int id, String ename, Car car, Bike bike){
		 this.id = id;
		 this.ename = ename;
		 this.car = car;
		 this.bike = bike;
	 }
	 void display(){
		 System.out.println("Employee Details");
		 System.out.println("Employee name = "+ename +"\nEmployee id = "+id);
		 
		 System.out.println();
		 System.out.println("Car Details");
		 System.out.println("Car name = "+car.carname +"\nCar Colour = "+car.colour +"\nCar Licence No = "+car.carlicenceno);
		 
		 System.out.println();
		 System.out.println("Bike Details");
		 System.out.println("Bike name = "+bike.bikename +"\nBike Licence No = "+bike.bikelicenceno);
	 }
}
 
 class AggrigationExample1{
	public static void main(String args[]){
		Car c = new Car("i20" , "White" , "GJ 06 LM 4658");
		Bike b = new Bike("Avenger" , "GJ 06 km 0098");
		Employee e = new Employee(101 , "Bharat" , c , b);
		e.display();
	}
 }