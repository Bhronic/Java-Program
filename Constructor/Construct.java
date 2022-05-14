class ConstructData{
	int id;
	String name;
	int age;
	
	ConstructData(){
		System.out.println("This is default Constructor");
	}
	
	ConstructData(int i, String n){
		id = i;
		name = n;
	}

	ConstructData(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	void display(){
		System.out.println(id +"  "+ name +"  "+ age);
	}
}

class Construct{
	public static void main(String args[]){
		ConstructData cd = new ConstructData();
		ConstructData cd1 = new ConstructData(111,"Om");
		ConstructData cd2 = new ConstructData(111,"Om",25);
		cd.display();
		cd1.display();
		cd2.display();
		
	}
}
