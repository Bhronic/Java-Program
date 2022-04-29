abstract class Bank{    
	abstract int getRateOfInterest();  

	int factorial(int n){
		int f=1;
		for(int i=1;i<=n;i++){
		 f=f*i;
		}
		return f;
	}		
}
    
class SBI extends Bank{    
	
	SBI(){
	System.out.println("factorial	: "+factorial(5));    	
	}
	
	int getRateOfInterest(){
		return 7;
	} 
	
}
    
class PNB extends Bank{    
	int getRateOfInterest(){
		return 8;
	}    
}    
    
class TestBank{    
	public static void main(String args[]){    

		Bank b;  

		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    

		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}