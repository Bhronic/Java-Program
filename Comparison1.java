//import java.util.*;

class Comparison1{  
 public static void main(String args[]){  
	String s1="Sachin";  
	String s2="Sachin";  
	String s3=new String("Ramana");  
	String s4="Saurav";
	String s5="sachIn";   
	
	System.out.println(" equals() ");
	System.out.println(s1.equals(s2));//true  
	System.out.println(s1.equals(s3));//true  
	System.out.println(s1.equals(s4));//false  
    System.out.println(s1.equalsIgnoreCase(s5));//true  
	
	System.out.println(" .compareTo() ");  
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s1));
	
	StringJoiner s = new StringJoiner(" ");
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	
	System.out.println(s.toString());
	
	StringBuilder sb1 = new StringBuilder("Hello");    //String 1  
    StringBuilder sb2 = new StringBuilder(" World");    //String 2  
    StringBuilder sb = sb1.append(sb2).append(s3).append(s4);   //String 3 to store the result  
    System.out.println(sb.toString());  //Displays result  
 }  
}  