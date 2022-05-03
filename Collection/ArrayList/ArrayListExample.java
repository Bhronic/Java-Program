import java.util.*;

class ArrListExample{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();		
		list.add("Ved");
		list.add("Palak");
		list.add("Ved");
		list.add("Om");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}