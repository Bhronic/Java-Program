class Method{
	final void display(){     
		System.out.println("This is final class methd");
	}
}

class Method1 extends Method{
	void display(){       //  display() in Method1 cannot override display() in Method..  Becaus overridden method is final 
		System.out.println("This is Normal class methd");
	}
}

class FinalMethodExample{
	public static void main(String args[]){
		Method1 m = new Method1();
		m.display();
	}

}