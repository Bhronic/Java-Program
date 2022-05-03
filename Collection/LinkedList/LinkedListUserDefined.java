import java.util.LinkedList;

class Employee{
	String empName;
	int id;
	String designation;
	float experience;
	
	Employee(String empName, int id, String designation, float experience){
		this.empName = empName;
		this.id = id;
		this.designation = designation;
		this.experience = experience;
	}
}

class LinkedListUserDefined{
	public static void main(String args[]){
		LinkedList<Employee> list = new LinkedList<Employee>();
		Employee e1 = new Employee("Vijay",2409,"Sales Manager",4.7f);
		Employee e2 = new Employee("Lakhan",1596,"Java Devloper",3);
		Employee e3 = new Employee("Sonal",1842,"Front-end Devloper",5);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Employee e : list)
			System.out.println(e.empName +" | "+e.id+" | "+e.designation+ " | " +e.experience);
	}
}