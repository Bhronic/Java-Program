class ThreadEx extends Thread{
	public void run(){
		System.out.println("Thread Execute....");
	}
	
	public static void main(String arggs[]){
		ThreadEx te = new ThreadEx();
		ThreadEx te1 = new ThreadEx();
		te.start();
		te1.start();
	}
}