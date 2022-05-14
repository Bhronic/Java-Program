/*  Simple instanceof Program
class InstanceOfOperator{
	public static void main(String args[]){
		InstanceOfOperator iop = new InstanceOfOperator();
		System.out.println( iop instanceof InstanceOfOperator);
	}
}   */
 
/*  Second instanceof Program using inheritance between two class

class Opreator{

}	
class InstanceOfOperator extends Opreator{
	public static void main(String args[]){
		InstanceOfOperator op = new InstanceOfOperator();
		System.out.println( op instanceof InstanceOfOperator);
	}
} */

/*  3)  instanceof operator using upcasing
class Opreator{

}	
class InstanceOfOperator extends Opreator{
	public static void main(String args[]){
		Opreator op = new InstanceOfOperator();
		System.out.println( op instanceof InstanceOfOperator);
		System.out.println(d instanceof Opreator);
	}
}  */

/*  4)  instanceof operator with a variable that have null value, it returns false
class InstanceOfOperator{
	public static void main(String args[]){
		InstanceOfOperator iop = null;
		System.out.println( iop instanceof InstanceOfOperator);
	}
}
