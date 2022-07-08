
public class AccountTransactionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj= new AccountDetails();
		Mythread2 t2= new Mythread2(obj);	
		Mythread1 t1= new Mythread1(obj);
		
		t2.start();
		t1.start();
	}

}
