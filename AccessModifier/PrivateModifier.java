package privatemodifier;

class PrivateMethod{
	private void msg(){
		System.out.println("This the Private Access Modifer Example");
	}
}

class PrivateModifier{
	public static void main(String args[]){
		PrivateMethod pv = new PrivateMethod();
		pv.msg();
	}
}