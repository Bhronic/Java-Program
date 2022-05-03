import java.util.LinkedList;
import java.util.Iterator;

class ReverseLinkedList{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Goat");
		System.out.println("Original List");
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println();
		System.out.println("Reverse List");
		
		Iterator itr =list.descendingIterator();  
        while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
