class StudentData{
	int id;
	String name;
	float fee;
	String collage;
	
	StudentData(String collage){
		this.collage=collage;
	}
	
	StudentData(int id, String name, float fee){
		this("M.S University");
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	void display(){
		System.out.println(id +"  "+ name +"  "+ fee +"  "+ collage);
	}
	
	void callMethod(){
		display();
	}
}

class ThisTest{
	public static void main(String args[]){
		StudentData sd = new StudentData(111, "Om" , 5000f);
		StudentData sd1 = new StudentData(112, "Palak" , 6000f);
		sd.callMethod();
		sd1.callMethod();
	}
}