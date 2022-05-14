abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("Triangle");
	}
}

class AbstractExample{
	public static void main(String args[]){
		Shape s;
		s = new Circle();
		s.draw();
		s = new Square();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}