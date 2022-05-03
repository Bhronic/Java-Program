import java.util.ArrayList;
import java.util.*;

class CollectionArrayRemoveMethods{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		System.out.println("Remove element thorugh element name");
		list.remove("Cat");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Remove element thorugh Sepcified index num");
		list.add("Goat");
		
		list.remove(2);
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println();

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Cow");
		list1.add("Buffelo");
		
		list.addAll(list1);
		
		System.out.println("Updated List : " +list);

		System.out.println("Remove Another List From List");
				
		list.removeAll(list1);
		Iterator itr2 = list.iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
		list.addAll(list1);
		System.out.println();
		System.out.println("Updated List : " +list);
		System.out.println("Remove element using lamda function");
		list.removeIf(str -> str.contains("Rabbit"));
		//System.out.println("After invoking removeIf() method: "+list); 
		Iterator<String> itr3 = list.iterator();
		
		while(itr3.hasNext()){
			System.out.println(itr3.next());
		}
		
		System.out.println();
		System.out.println("Clear Whole List");
		list.clear();
		Iterator itr4 = list.iterator();
		
		while(itr4.hasNext()){
			System.out.println(itr4.next());
		}
	}
}
		
		