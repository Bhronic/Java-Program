import java.util.ArrayList;
import java.util.*;

class ArrayListRetain{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("First ArrayList");
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Second ArrayList");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Cow");
		list1.add("Buffelo");
		list1.add("Dog");
		
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println();
		System.out.println("After Retain First and Second List");
		
		list.retainAll(list1);
		
		Iterator itr2 = list.iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
}
		