class Bike{
	final void run(){
		System.out.println("Speed Limit");
	}
}


class Honda extends Bike{
	void run(){
		System.out.println("Speed Limit is 100kph");
	}
}

class FinalTest1{	
	public static void main(String args[]){
		Honda h = new Honda();
		h.run();
	}
}