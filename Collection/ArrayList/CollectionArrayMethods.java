import java.util.ArrayList;
import java.util.*;

class CollectionArrayMethods{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		list.add(2,"Parrot");
		list.add(1,"Fish");
		
		System.out.println("List after adding two element at specified place");
		
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Cow");
		list1.add("Buffelo");
		
		list.addAll(list1);
		
		System.out.println("After adding list to another list");
		
		Iterator itr3 = list.iterator();
		
		while(itr3.hasNext()){
			System.out.println(itr3.next());
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ox");
		
		list.addAll(7,list2);
		
		System.out.println("After adding list to another list to specified place");
		
		Iterator itr4 = list.iterator();
		
		while(itr4.hasNext()){
			System.out.println(itr4.next());
		}
		
	}
}
