import java.util.HashSet;

class HashSetAddMethod{
	public static void main(String args[]){
		HashSet<String> set = new HashSet<>();
		
		set.add("Dog");
		set.add("Cat");
		set.add("Rabbit");
		set.add("Goat");
		
		System.out.println("Original Set");
		for(String a:set)
			System.out.println(a);
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("Ox");
		set1.add("Cow");
		set1.add("Buffelo");
		
		set.addAll(set1);
		System.out.println("Adding another set");
		for(String b:set1)
			System.out.println(b);
	}
}