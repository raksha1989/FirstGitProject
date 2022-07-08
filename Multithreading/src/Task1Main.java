class Task1 implements Runnable
{
    int cnt =1;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" "+ cnt );
		cnt++;
		}
	}
}
public class Task1Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 t1= new Task1();
		Thread tt1= new Thread(t1);
				
		Thread tt2= new Thread(t1);
		tt1.start();
		//tt1.join();
		tt2.start();

	}

}
