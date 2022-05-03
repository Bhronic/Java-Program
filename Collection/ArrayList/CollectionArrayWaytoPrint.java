import java.util.ArrayList;
import java.util.*;

class CollectionArrayWaytoPrint{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		System.out.println("======Iterator Method===========");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("======For Loop===========");
		for(int i=0; i<list.size() ; i ++){
			System.out.println(list.get(i));
		}
		
		System.out.println("======ForEach Loop===========");
		for(String a : list){
			System.out.println(a);
		}
		
		System.out.println("======ForEach Loop with Lambda===========");
		list.forEach(a ->{
			System.out.println(a);
		});
		
		System.out.println("======forEachRemaining Loop with Lambda by using Iterator Method===========");
		Iterator itr1 = list.iterator();
		itr1.forEachRemaining(a ->{
			System.out.println(a);
		});
		
		
		
	}
}
