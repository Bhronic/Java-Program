class Animal{

}

class Dog extends Animal{
	static void method(Animal a){
		if(a instanceof Dog){
			Dog d = (Dog)a;
			System.out.println(" Here Downcast perform");
		}
	}
}

class DownCastInstanceof{
	public static void main(String args[]){
		Animal d = new Dog();
		Dog.method(d);
	}

}