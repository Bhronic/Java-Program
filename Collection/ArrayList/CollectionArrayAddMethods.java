import java.util.ArrayList;
import java.util.*;

class CollectionArrayAddMethods{
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
		
		System.out.println("List after adding two element at specified place");
		
		list.add(2,"Parrot");
		list.add(1,"Fish");
		
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println("After adding list to another list");
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Cow");
		list1.add("Buffelo");
		
		list.addAll(list1);
		
		Iterator itr3 = list.iterator();
		
		while(itr3.hasNext()){
			System.out.println(itr3.next());
		}
		
		System.out.println("After adding list to another list to specified place");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ox");
		
		list.addAll(7,list2);
		
		Iterator itr4 = list.iterator();
		
		while(itr4.hasNext()){
			System.out.println(itr4.next());
		}
		
	}
}
