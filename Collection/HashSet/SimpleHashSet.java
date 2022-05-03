import java.util.HashSet;
import java.util.Iterator;

class SimpleHashSet{
	public static void main(String args[]){
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		for(String a : set)
			System.out.println(a);
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		Iterator<Integer> itr = set1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}