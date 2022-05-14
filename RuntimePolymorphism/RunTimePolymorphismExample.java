class Animal{
	void eat(){
		System.out.println("Different Types of eating");
	}
}

class Dog extends Animal{
	void eat(){
		System.out.println("Eat Bread");
	}
}

class RunTimePolymorphismExample{
	public static void main(String args[]){
		Animal a = new Dog();
		a.eat();
	}
}