class MainMethodOverloading{
	public static void main(String args[]){
		System.out.println("This is the main method with command line argument");
		main("a");
		main();
	}
	
	public static void main(String a){
		System.out.println("This is the main method that a parameter as String as a Datatype and a is a variable");
	}
	
	public static void main(){
		System.out.println("This is a default main method");
	}
}