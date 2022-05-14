class Area{
	float length;
	float width;
	
	Area(float length , float Width){
		this.length = length;
		this.width = width;
	}
	
	public void getArea(){
		System.out.println("Area of Rectangle : " +(length*width));
	}		
}

class AreaEncapsulation{
	public static void main(String args[]){
		Area a = new Area(4f,8f);
		//a.setArea(4f , 8f);
		a.getArea();
	}
}

//why i get 0.0 output??