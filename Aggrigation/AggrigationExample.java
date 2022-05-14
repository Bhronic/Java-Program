 class Car{
	String name;
	String colour;	
	String licenceno;
	
	Car(String name, String colour, String licenceno){
		this.name = name;
		this.colour = colour;
		this.licenceno = licenceno;
	}
}
 
 class Employee{
	 int id;
	 String ename;
	 Car car;
	 
	 Employee(int id, String ename, Car car){
		 this.id = id;
		 this.ename = ename;
		 this.car = car;
	 }
	 
	 void display(){
		 System.out.println("Employee Details");
		 System.out.println("Employee name = "+ename +"\nEmployee id = "+id);
		 System.out.println("Car Details");
		 System.out.println("Car name = "+car.name +"\nCar Colour = "+car.colour +"\nCar Licence No = "+car.licenceno);
	 }
}
 
 class AggrigationExample{
	public static void main(String args[]){
		Car c = new Car("i20" , "White" , "GJ 06 LM 4658");
		Employee e = new Employee(101 , "Bharat" , c);
		e.display();
	}
 }