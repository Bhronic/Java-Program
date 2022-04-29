class InvalidAgeException extends Exception{
	public InvalidAgeException(String errorMessage){
		super(errorMessage);
	}
}

public class TestThrow1 {   
    //function to check if person is eligible to vote or not   
    
	public static void validate(int age) throws InvalidAgeException{  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            //int x= 100/0;
			throw new InvalidAgeException("Person is not eligible to vote....");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    
	//main method  
	public static void main(String args[])throws InvalidAgeException{  
        //calling the function  
        validate(21);  
        System.out.println("rest of the code...");    
  }    
}    