class Employee implements Cloneable{
	String name;
	String id;
	
	Employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public String toString(){
		return name +"  "+ id;
	}
	
	protected Employee clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
}

class CloningClass{
	public static void main(String args[])
	 throws CloneNotSupportedException{
		Employee e = new Employee("Palak" , "101");
		
		System.out.println("---------Original Value---------");
		System.out.println(e);
		System.out.println("HashCode of e Object = "+e.hashCode());
		
		System.out.println();

		Employee e1 = e.clone();
		System.out.println(e1);
		System.out.println("HashCode of e1 Object = "+e1.hashCode());
		
	}
}