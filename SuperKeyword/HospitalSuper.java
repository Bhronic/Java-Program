class Patient{
	int p_num;
	String p_name;
	int room_num;
	String hospital= "Civil Hospital";
	
	Patient(int p_num , String p_name , int room_num)
	{
		this.p_num = p_num;
		this.p_name = p_name;
		this.room_num = room_num;
	}
	
	void display(){
		System.out.println("Patient Detail");
	}
}

class Illness extends Patient{
	String ill_name;
	Illness(int p_num , String p_name , int room_num, String ill_name){
			super(p_num,p_name,room_num);
			this.ill_name = ill_name;
	}
	
	void display(){
		super.display();
		System.out.println( "Patient no = " +p_num + "\nPatient name = "+p_name +"\nRoom no = "+room_num +"\nIllness name = "+ill_name);
		System.out.println("Hospital name = " + super.hospital);
		
		System.out.println();
	}
}

class HospitalSuper{
	public static void main(String args[]){
		Illness hd = new Illness(101 , "Bhaveshbhai" , 206 , "Maleria");
		hd.display();
		
		Illness hd1 = new Illness(203 , "Deepaben" , 461 , "Jaundice");
		hd1.display();

	}
}