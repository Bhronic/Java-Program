class Animal{
		
}

class Dog extends Animal{
	static void method(Animal a){
		Dog d = (Dog)a;
		System.out.println("Here Upcast without the use of instanceof");
	}
}

class UpcastWithoutInstanceOf{
	public static void main(String args[]){
		Animal a = new Dog();
		Dog.method(a);
	}
}