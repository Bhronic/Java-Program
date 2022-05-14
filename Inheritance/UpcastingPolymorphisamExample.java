class Bank{
	float getRateOfIntrest(){
		return 0;
	}
}

class SBI extends Bank{
	float getRateOfIntrest(){
		return 6.7f;
	}
}

class AXIS extends Bank{
	float getRateOfIntrest(){
		return 7.2f;
	}
}

class HDFC extends Bank{
	float getRateOfIntrest(){
		return 5.7f;
	}
}

class UpcastingPolymorphisamExample{
	public static void main(String args[]){
		Bank b,b1,b2;
		b=new SBI();
		b1=new AXIS();
		b2=new HDFC();
		System.out.println("AXIS Rate Of Intrest : "+b2.getRateOfIntrest());
		System.out.println("SBI Rate Of Intrest : "+b.getRateOfIntrest());
		System.out.println("AXIS Rate Of Intrest : "+b1.getRateOfIntrest());


	}
}