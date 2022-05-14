class CopyData{
	int id;
	String name;
	
	CopyData(int i,String n){
		id = i;
		name = n;
	}
	
	CopyData(){ }
	
	void display(){
		System.out.println(id +"  "+ name);
	}
}


class Copy1{
	public static void main(String args[]){
		CopyData cd = new CopyData(111,"Om");
		CopyData cd1 = new CopyData();
		cd1.id = cd.id;
		cd1.name = cd.name;
		cd.display();
		cd1.display();
	}

}