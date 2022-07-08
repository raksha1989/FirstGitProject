class Test3 extends Thread
{
	public Test3(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+10);
			if(i==2)
			{
				
					//join(4000);
				Thread.currentThread().yield(); //the excuting thread will stop its execution and will allow other low priority thread to run
				
			}
		}
	}
}

class Test4 extends Thread
{
	int cnt=0;
	public Test4(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MultipleTaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 t3= new Test3("Thread3");
		Test4 t4= new Test4("thread4");
		
		t3.start();
		t4.start();

	}

}
