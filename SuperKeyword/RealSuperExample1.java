class Person{
	int id;
	String name;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	float salary;
	
	Employee(int id, String name, float salary){
		super(id,name);
		this.salary = salary;
	}
	
	void display(){
		System.out.println(id +"  " +name +"  "+salary);
	}
}

class RealSuperExample1{
	public static void main(String args[]){
		Employee es = new Employee(101 , "Vedant" , 20000f);
		es.display();
		
		Employee es1 = new Employee(102 , "Om" , 25000f);
		es1.display();
		
		Employee es2 = new Employee(103 , "Palak" , 15000f);
		es2.display();


		
	}
}