import java.util.LinkedList;

class SimpleLinkedList{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Goat");
		
		for(String a : list){
			System.out.println(a);
		}
	}
}