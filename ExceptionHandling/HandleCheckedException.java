import java.io.FileNotFoundException;  
import java.io.PrintWriter; 

class HandleCheckedException{
	public static void main(String args[]){
		PrintWriter pw;
		try{
			pw = new PrintWriter("jdr.txt");
			pw.println("Saved");
		}
		catch(FileNotFoundException f){
			System.out.println("File not found");
		}
		System.out.println("File Succesfully Saved");
	}
}