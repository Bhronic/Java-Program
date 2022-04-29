import java.util.*;  
public class QueueExample{  
public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit Sharma");  
	queue.add("JaiShankar");  
	queue.add("Raj");  
	queue.add("Vijay Raj");
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("==============iterating the queue elements:");  
	
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
		System.out.println(itr.next());  
	}  
	
	queue.remove();   
	  
	
	System.out.println("===============after removing two elements:");  
	
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
		System.out.println(itr2.next());  
	}

	queue.poll();	
	
	System.out.println("===============after removing two elements:");  
	
	Iterator<String> itr3=queue.iterator();  
	while(itr3.hasNext()){  
		System.out.println(itr3.next());  
	}
}  
}  