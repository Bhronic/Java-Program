class Method{
	void getdata(Method m){
		int x = 10;
		System.out.println(x*x);
	}

	void p(){
		getdata(this);
	}
}


class MethodPassThis{
	public static void main(String args[]){
		Method m = new Method();
		m.p();
	}

}