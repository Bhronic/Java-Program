abstract class Shape{
	String color;
	
	abstract double area();
	abstract void display();
	
	Shape(String color){
		System.out.println("This is the Abstract Shape");
		this.color = color;
	}
	
	String getColor(){
		return color;
	}
}

class Circle extends Shape{
		double radius;
		
		Circle(String color , double radius){
			super(color);
			this.radius = radius;
		}
		
		double area(){
			return 3.14 * (radius *radius) ; 
		}
		
		void display(){
			System.out.println("Circle color ="+ super.getColor() + " Circle area = " +area());
		}
}

class Rectangle extends Shape{
		double length;
		double width;
		
		Rectangle(String color , double length , double width){
			super(color);
			this.length = length;
			this.width = width;
		}
		
		double area(){
			return length * width ; 
		}
		
		void display(){
			System.out.println("Rectangle color ="+ super.getColor() + " Rectangle area = " +area());
		}
}

class AbstractExample1{
	public static void main(String args[]){
		Shape s1 = new Circle ("Red" , 2);
		Shape s2 = new Rectangle ("Green" , 2 , 2);
		
		s1.display();
		s2.display();
	}
}