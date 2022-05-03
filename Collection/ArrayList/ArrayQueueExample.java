import java.util.*;

class ArrayQueueExample{
	public static void main(String args[]){
		ArrayDeque<Integer> aq = new ArrayDeque<>();
		
		aq.add(16);
		aq.add(50);
		aq.add(37);
		
		Iterator<Integer> itr = aq.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

