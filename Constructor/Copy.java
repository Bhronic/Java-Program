class CopyData{
	int id;
	String name;
	
	CopyData(int i,String n){
		id=i;
		name=n;
	}
	
	CopyData(CopyData cd){
		id = cd.id;
		name = cd.name;
	}
	
	void display(){
		System.out.println(id +"  "+ name);
	}
}

class Copy{
	public static void main(String args[]){
		CopyData cd1 = new CopyData(111,"Om");
		CopyData cd2 = new CopyData(cd1);
		cd1.display();
		cd2.display();
	}
}