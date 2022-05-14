class Data{
	int value = 10;
	
	void setValue(int v){
		value = v;
	}
	
	void getValue(){
		System.out.println(value);
	}
}


class FinalTest3{
	public static void main(String args[]){
		final Data d = new Data();
		d = new Data();
		d.setValue(67);
		d.getValue();
	}
		
}