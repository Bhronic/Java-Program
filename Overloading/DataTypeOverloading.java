class DataType{
	int sum(){
		int a = 10, b =20 , result;
		result = a+b;
		System.out.println("Addition = "+result);
		return 0;
	}
	
	int sum(int a , int b){
		int result;
		result = a+b;
		System.out.println("Addition = "+result);
		return 0;
	} 
	
	double sum(double a, float b){
		float result;
		result = a+b;
		System.out.println("Addition = "+result);
		return 0;
	}
	
	double sum (float a, double b){
		double result;
		result = a+b;
		System.out.println("Addition = "+result);
		return 0;
	}
}

class DataTypeOverloading{
	public static void main(String args[]){
		DataType dt = new DataType();
		dt.sum();
		dt.sum(8,3);
		dt.sum(5,10);
		dt.sum(4f,5f);
	}
}

//Ambiguity created