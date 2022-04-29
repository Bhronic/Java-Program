class Demo{
		static int x1 = 25; //local variable
			
		static int y = 10; //static variable
		
		public static void main(String []x){
			int a = 10; //instance
			
			float f = a;
			System.out.println("winding f="+f);
			
			int n = (int)f;
			
			byte b = 10;
			byte c = 25;
			System.out.println("b = "+b);
			byte ans = (byte)(b+c);
			
			System.out.println("ans="+ans);
			System.out.println("narrowing n="+n);
			System.out.println("wel come to java");
			System.out.println(" x ="+ (x1*y));
			System.out.println(" y ="+ (y+x1));
			System.out.println(" a ="+ (a+x1-y/a*x1));
			main();
		}

		public static void main(){
				System.out.println("void main method");
		}


}