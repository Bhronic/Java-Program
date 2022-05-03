import java.util.*;

class LinkedHashSetExmple{
	public static void main(String args[]){
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Om");
		lhs.add("Vedant");
		lhs.add("Om");
		lhs.add("Palak");
		lhs.add("Om");
		
		Iterator<String> itr = lhs.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}