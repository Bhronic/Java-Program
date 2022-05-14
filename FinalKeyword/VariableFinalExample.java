class Form{
	final int form_no;
	
	void form(){
		form_no = 20;  // error : cannot assign a value to final variable form_no
	}
	
	void display(){
		System.out.println("Form No = "+form_no);
	}
}

class VariableFinalExample{
	public static void main(String args[]){
		Form f = new Form();
		f.display();
	}
}