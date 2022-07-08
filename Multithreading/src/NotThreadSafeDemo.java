class BankAccount
{
	int amt=5000;
	/*
	public synchronized void onlineTransfer(String s,int a)
	{
		if(s.equals("deposit"))
		{
			System.out.println("Depositing the amount");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		amt +=a;
		System.out.println("total Balance: "+amt);
	}*/
	public void onlineTransfer(String s,int a)
	{
		if(s.equals("deposit"))
		{
			System.out.println("Depositing the amount");
			synchronized(this)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			amt +=a;
		}
		System.out.println("total Balance: "+amt);
	}
}

class Customer implements Runnable
{
	BankAccount obj= new BankAccount();
	
	public void run()
	{
		System.out.println("Transaction in process");
		obj.onlineTransfer("deposit", 20000);
		System.out.println("transaction done..!!");
	}
}
public class NotThreadSafeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer();
		Thread t1= new Thread(c1);
		Thread t2= new Thread(c1);
		
		t1.start();
		t2.start();
		
	}

}
