import java.util.*;  
class CollectionArray{  
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Bhavik");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Sandip");  
		list.add("Palak");  
		
		list.add(1,"Mayur");
		
		Collections.sort(list);
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		// foreach
		// System.out.println("==========foreach============");
		// list.forEach(String a : list){
			// System.out.println(a);  
		// };
		
		// foreach using lamda expresion
		/* lamda expresion
			(argument) -> {
				body
			}
		*/
		System.out.println("=========foreach lamda expresion =============");
		list.forEach((a)-> {
			System.out.println(a);  
		});
		
		//forEachRemaining using lamda expresion use with Iterator
		System.out.println("==========forEachRemaining lamda expresion============");
		Iterator itr4=list.iterator();
		itr4.forEachRemaining((a)->{
			System.out.println(a);  
		});
				
		
		list.set(4,"Parul");
		//list.clear(); //clear method
		list.remove(1);
		
		System.out.println("======================");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.addAll(list);		
		
		System.out.println(list1.get(2)); 
		System.out.println("isEmpty : "+list1.isEmpty()); 
		System.out.println("lastIndexOf : "+list1.lastIndexOf("Palak"));		
		//Traversing list through Iterator  
		Iterator itr1=list1.iterator();  
		
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
		
		System.out.println("======================");
		List<String> newSubList = list.subList(0,3);
		
		  
		Iterator itr2=newSubList.iterator();  
		
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}
		System.out.println(newSubList.size());  
	}  
}  