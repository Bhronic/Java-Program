import java.util.ArrayList;
import java.util.Iterator; 

class CollectionArrayGetSet{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		System.out.println("Return Element using get() method : "+list.get(2));
		
		System.out.println("Set Method at index 2 using set() method");
		list.set(2,"Parrot");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

