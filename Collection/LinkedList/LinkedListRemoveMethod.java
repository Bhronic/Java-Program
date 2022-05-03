import java.util.LinkedList;

class LinkedListRemoveMethod{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		System.out.println("Original List");
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Goat");
		
		System.out.println("Original List");
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("Remove elemnt through element name and specified index num");
		list.remove("Goat");
		list.remove(2);
		
		for(String a : list)
			System.out.println(a);
		
		System.out.println();
		System.out.println("Make Another List");
		LinkedList<String> list1 = new LinkedList<>();
		list.add("Ox");
		list.add("Cow");
		list.addAll(list1);
		System.out.println("Updated List : "+list);
		
		System.out.println("Remove added list");
		list.removeAll(list1);
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("Remove first element : "+list.removeFirst());
		
		System.out.println();
		System.out.println("Remove last	element : "+list.removeLast());
		
		System.out.println("Updated List : "+list);
		
		System.out.println();
		System.out.println();
		list.add("Horse");
		list.add("Camel");
		list.add("Sheep");
		System.out.println("Updated List : "+list);
		
		System.out.println("After invoking remove First Occurance : "+list.removeFirstOccurrence("horse"));
		System.out.println("After invoking remove Last Occurance : "+list.removeLastOccurrence("Sheep"));
	}
}
		