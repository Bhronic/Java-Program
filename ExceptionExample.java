public class ExceptionExample{  
  
  public static void main(String args[]){  
   try{  
//      int a[]=new int[5];  
//	  a[10]=50; 
//	   int b = 100/0;
	   
	   try{  
		  int a[]=new int[5];  
		  a[10]=50; 
	   }catch(ArrayIndexOutOfBoundsException e)
	   {
			  System.out.println("Array Index Out Of Bounds");  
	   }
    }
	catch(ArrayIndexOutOfBoundsException e)
   {
	   try{  
		  int b = 100/0;
	   }catch(ArithmeticException e)
	   {
			  System.out.println("can't be divided by 0");  
	   }
	      System.out.println("Array Index Out Of Bounds");  
   }catch(ArithmeticException e)
   {
	      System.out.println("can't be divided by 0");  
   }
   finally{
	   System.out.println("finally block of code .....");  
   }     
	System.out.println("rest of the code...");  
  }  
}  