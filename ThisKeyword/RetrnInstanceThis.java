class Return{
	Return getData(){
		return this;
	}
	
	void display(){
		getData();
		System.out.println("This return current class instance");
	}
}

class RetrnInstanceThis{
	public static void main(String args[]){
		Return r = new Return();
		r.display();
	}
}