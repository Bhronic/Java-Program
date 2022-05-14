package dog;
import animal.*;

class Dogs{
	public void sound(){
		System.out.println("Dog is barking");
	}
	
	public void eat(){
		System.out.println("Dog eats breads");
	}
	
	public static void main(String args[]){
		Dogs d = new Dogs();
		d.sound();
		d.eat();
	}
}