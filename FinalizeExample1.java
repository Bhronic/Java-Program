public class FinalizeExample1 { 
	
	@Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }  
 
     public static void main(String[] args)   
    {   
        FinalizeExample1 obj = new FinalizeExample1();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    
}  