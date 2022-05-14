class Parameter{
	void sum(){
		int a = 10, b =20 , result;
		result = a+b;
		System.out.println("Addition = "+result);
	}
	
	void sum(int x, int y){
		int result;
		result = x+y;
		System.out.println("Addition = "+result);
	}
	
	void sum (int x, double y){
		double result;
		result = x+y;
		System.out.println("Additiob = "+result);
	}
}

class ParameterOverloading{
	public static void main(String args[]){
		Parameter p = new Parameter();
		p.sum();
		p.sum(6,4);
		p.sum(8,8);
	}

}