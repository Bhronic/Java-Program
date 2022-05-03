import java.util.ArrayList;
import java.util.*;

class CollectionArray{
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
	}
}

