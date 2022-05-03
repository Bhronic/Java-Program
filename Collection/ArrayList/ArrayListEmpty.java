import java.util.ArrayList;

class ArrayListEmpty{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Is any element in List : "+ list.isEmpty());
		
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		
		System.out.println("Update List "+list);
		System.out.println("Is any element in List : "+ list.isEmpty());
	}
}