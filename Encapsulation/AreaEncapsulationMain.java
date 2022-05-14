//package rectangle;

class Area{
	float length;
	float width;
	
	public void setLength(float length){
		this.length = length;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public void getArea(){
		
		float area = length*width;
		System.out.println("Area of Rectangle : " +area);
	}		
}

class AreaEncapsulationMain{
	public static void main(String args[]){
		Area a = new Area();
		a.setLength(4f);
		a.setWidth(8f);
		a.getArea();
	}
}


//why i get 0.0 output???