import java.util.LinkedList;

class LinkedListAddMethod{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		System.out.println("Original List");
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Goat");
		
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("Adding elemnt at specified place");
		list.add(3,"Mouse");
		
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("Adding Another List");
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Cow");
		list1.add("Buffelo");
		
		list.addAll(list1);
		for(String a: list)
			System.out.println(a);
		
		System.out.println();
		System.out.println("Adding Another List at specified place");
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Ox");
		
		list.addAll(6,list2);
		for(String a: list)
			System.out.println(a);
		
		System.out.println();
		list.addFirst("Puppy");
		System.out.println("Add element at First Position");
		for(String a : list)
			System.out.println(a);
		
		System.out.println();
		list.addLast("Horse");
		System.out.println("Add element at Last Position");
		for(String a : list)
			System.out.println(a);
	}
}
		
		