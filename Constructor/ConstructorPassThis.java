class ConstructorData{
	ConstructorPassThis cpt;
	ConstructorData(ConstructorPassThis obj){
		this.cpt = obj;
	}
	
	void display(){
		int sum = cpt.data + cpt.data;
		System.out.println(sum);
	}
}

class ConstructorPassThis{
	int data =10;
	ConstructorPassThis(){
		ConstructorData cd = new ConstructorData(this);
		cd.display();
	}
	
	public static void main(String args[]){
		ConstructorPassThis cpt1 = new ConstructorPassThis();
	}
}