class WrapperClass{
	public static void main(String args[]){
		boolean b2 = true;
		char c = 'a';
		byte b = 12;
		short s = 23;
		int i = 35;
		long l = 100l;
		float f = 45.9f;
		double d = 100.67d;
		
		
		Boolean booleanobj = b2;
		Character charobj = c;
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		
		System.out.println("Autoboxing");
		System.out.println("Boolean Object = " +booleanobj);
		System.out.println("Character Object = "+charobj);
		System.out.println("Byte Object = "+byteobj);
		System.out.println("Short Object = "+shortobj);
		System.out.println("Integer Object = "+intobj);
		System.out.println("Long Object = "+longobj);
		System.out.println("Float Object = "+floatobj);
		System.out.println("Double Object = "+doubleobj);

		boolean booleanvalue = booleanobj;
		char charvalue = charobj;
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		
		System.out.println("Unboxing");
		System.out.println("Boolean Value = " +booleanvalue);
		System.out.println("Character Value = "+charvalue);
		System.out.println("Byte Value = "+bytevalue);
		System.out.println("Short Value = "+shortvalue);
		System.out.println("Integer Value = "+intvalue);
		System.out.println("Long Value = "+longvalue);
		System.out.println("Float Value = "+floatvalue);
		System.out.println("Double Value = "+doublevalue);


	}
}