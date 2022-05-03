import java.util.*;
import java.util.LinkedList;

class LinkedListExample{
	public static void main(String args[]){
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(23);
		list.add(76);
		list.add(49);
		list.add(76);
		list.add(10);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}