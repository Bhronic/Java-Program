import java.util.ArrayList;
import java.io.*;

class SerializationDeserialization{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<>();
		list.add("Mango");  
		list.add("Apple");  
		list.add("Banana");  
		list.add("Grapes");
		
		try{
			
			//Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
			
			//Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list1 = (ArrayList)ois.readObject();
			System.out.println(list1);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}