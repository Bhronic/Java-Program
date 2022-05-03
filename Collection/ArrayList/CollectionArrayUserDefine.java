import java.util.ArrayList;
import java.util.*;

class SirArrayListUserDefine{
	public static void main(String args[]){
		
		Student s4 = new Student(4,"palak","xyz");
		Student s1 = new Student(1,"sandip","PQR");
		Student s2 = new Student(2,"Achal pathak","ABC");
		Student s3 = new Student(3,"Mayur bhai","qwexyz");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//Collections.sort(list);
				System.out.println("================using for each remaning =================");
		Iterator<Student> itr = list.iterator();
		itr.forEachRemaining((Student student) -> {
			System.out.println(student.rollno+" | "+student.name+" | "+ student.address);
		});
		//		System.out.println("================using while loop =================");
		//while(itr.hasNext()){
			// Student student = (Student)itr.next();
			// System.out.println(student.rollno+" | "+student.name+" | "+ student.address);
		// }
			System.out.println("================using foreach =================");
		for(Student student:list){
			System.out.println(student.rollno+" | "+student.name+" | "+ student.address);
		}
		System.out.println("================using lamda expresion =================");
		list.forEach((Student student) -> {
			System.out.println(student.rollno+" | "+student.name+" | "+ student.address);
		});
		
		// list.forEach((Student student) -> { if(student.rollno == 1){
			//System.out.println(student.rollno+" | "+student.name+" | "+ student.address);
			//return student;
			//}
		//});
	}
}	
		/*
			( data ) -> {
				     manipulation
					 return;
					}
		*/

