final class Final {
	void display(){
		System.out.println("This is Parent class with final keyword");
	}
}

class Final1 extends Final {
	void display(){
		System.out.println("This is child class");
	}
}

class FinalClassExample{     // cannot inherit from final Final
	public static void main(String args[]){
		Final1 fl = new Final1();
		fl.display();
		}
}