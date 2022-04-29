import java.util.*;  
class TestJavaCollection1{  
	public static void main(String args[]){  
		Stack<String> list=new Stack<String>();//Creating arraylist  
		list.push("Ravi");//Adding object in arraylist  
		list.push("Vijay");  
		list.push("Ravi");  
		list.push("Ajay");  
		
		list.pop();
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}  