import java.util.ArrayList;
//import java.util.Itreator;

class ArrayListUserDefined{
	public static void main(String args[]){
		StudentInfo s1 = new StudentInfo(23 , "Palak" , 6 , "GNFC");
		StudentInfo s2 = new StudentInfo(13 , "Vedant" , 7 , "GNFC");
		StudentInfo s3 = new StudentInfo(32 , "Om" , 9 , "C.H Patel");
		
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(StudentInfo si : list){
			System.out.println(si.rollno +" | " + si.name +" | "+ si.Standard +" | "+ si.SchoolName);
		}
	}
}