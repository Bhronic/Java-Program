class Data{
	int n = 100;
}

class DataMemberRunPolymotphism extends Data{
	
	int n = 400;  //Data Member can not be Upcast
	
	
	
	public static void main(String args[]){
		Data d = new DataMemberRunPolymotphism();
		System.out.println(d.n);
	}
	

}