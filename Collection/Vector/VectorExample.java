import java.util.*;
import java.util.Vector;

class VectorExample{
	public static void main(String args[]){
		Vector<String> v = new Vector<>();
		
		v.add("Dog");
		v.add("cat");
		v.add("horse");
		v.add("cow");
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

