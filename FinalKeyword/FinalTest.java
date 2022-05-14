class FinalData{
	final int speedlimit = 100;
	
	void run(){
		//System.out.println(speedlimit);
		speedlimit = 90;
	}
}

class FinalTest{
	public static void main(String args[]){
		FinalData fd = new FinalData();
		fd.run();
	}

}