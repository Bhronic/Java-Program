package account;

class TestAccountEncapsul{
	public static void main(String args[]){
		AccountEncapsul ae = new AccountEncapsul();
		ae.setAcc_no(1894);
		ae.setName("Vijay Kumar");
		ae.setEmail("vijaykumar457@gmail.com");
		ae.setBalance(50000);
		
		System.out.println(ae.getAcc_no() +"  "+ ae.getName() +"  "+ ae.getEmail() +"  "+ ae.getBalance());
	}
}