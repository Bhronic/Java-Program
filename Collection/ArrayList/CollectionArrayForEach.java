import java.util.ArrayList;

class CollectionArrayForEach{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");
		list.add("Mouse");
		
		for(String a : list){
			System.out.println(a);
		}
	}
}