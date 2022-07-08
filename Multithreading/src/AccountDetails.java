
public class AccountDetails {
	
	int balance=5000;
	public synchronized void deposit(int amt)
	{
		System.out.println("Please wait...amount being deposited");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance+=amt;
		System.out.println("total amount: "+balance);
		notify();
	}
	
	public synchronized  void withdraw(int amt)
	{
		if(balance<amt)
		{
			System.out.println("Balance low...Please try later");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Withdrawing the amount..please wait");
			balance-=amt;
			
		}
		System.out.println("Remaining balance: "+balance);
	}

}

class Mythread1 extends Thread
{
	AccountDetails obj;
	Mythread1(AccountDetails obj1)
	{
		obj=obj1;
	}
	
	public void run()
	{
		obj.deposit(30000);
		System.out.println("Transaction done...!!!!");
	}
	
}

class Mythread2 extends Thread
{
	AccountDetails obj;
	Mythread2(AccountDetails obj1)
	{
		obj=obj1;
	}
	
	public void run()
	{
		obj.withdraw(1000);
		System.out.println("Transaction done...!!!!");
	}
	
}
