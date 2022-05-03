import java.util.*;

class HashSetExmple{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Om");
		hs.add("Palak");
		hs.add("Vedant");
		//hs.add("Om");
		
		//hs.add("Om");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


//i got different output 