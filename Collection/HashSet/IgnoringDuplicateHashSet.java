import java.util.HashSet;

class IgnoringDuplicateHashSet{
	public static void main(String args[]){
		HashSet<String> set = new HashSet<>();
		
		set.add("Dog");
		set.add("Cat");
		set.add("Rabbit");
		set.add("Cat");
		set.add("Goat");
		
		for(String a:set)
			System.out.println(a);
	}
}