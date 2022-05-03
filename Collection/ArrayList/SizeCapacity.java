import java.util.ArrayList;

class SizeCapacity{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Size of the ArrayList : "+list.size());
		
		ArrayList<String> list1 = new ArrayList<>(10);
		System.out.println("Size of the ArrayList : "+list.size());
	
		list.add("Dog");
		list.add("Cow");
		System.out.println("Updated List : "+list);
		System.out.println("Size of the ArrayList : "+list.size());
	}
}	