import java.util.*;
import java.util.Stack;

class StackExample{
	public static void main(String args[]){
		Stack<String> s = new Stack<>();
		
		s.push("Om");
		s.push("Vedant");
		s.push("Palak");
		s.push("Rita");
		s.push("Heena");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		s.pop();
		
		Iterator<String> itr1 = s.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
