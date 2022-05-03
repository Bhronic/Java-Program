import java.util.*;

class TreeSetExample{
	public static void main(String args[]){
		TreeSet<String> ts = new TreeSet<>();
		
	
		ts.add("Vedant");
		ts.add("Om");
		ts.add("Palak");
		ts.add("Om");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

