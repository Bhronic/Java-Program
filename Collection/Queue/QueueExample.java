import java.util.*;
//import java.util.;

class QueueExample{
	public static void main(String args[]){
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		//System.out.println("head:"+q.element());  
		//System.out.println("head:"+q.peek());	
		
		Iterator<Integer> itr = q.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

