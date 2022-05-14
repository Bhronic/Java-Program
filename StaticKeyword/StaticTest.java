class StudentData{
	int id;
	String name;
	static String collage = "M.S University";
	
	static{
		System.out.println("This the Static method Example");
	}
	
	static void change(){
		collage = "DDIT";
	}
	
	StudentData(int i, String n){
		id = i;
		name = n;
	}
	
	
	void display(){
		System.out.println(id +"  "+ name +"  "+ collage);
	}
}

class StaticTest{
	public static void main(String args[]){
		StudentData.change();
		StudentData sd = new StudentData(111, "Om");
		StudentData sd1 = new StudentData(112, "Palak");
		sd.display();
		sd1.display();
	}
}
