
public class Task extends Thread{
	int cnt=0;
	Task(String s)
	{
		super(s);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getState());
		for(int i=0;i<5;i++)
		{
			cnt++;
			System.out.println(cnt+" - "+Thread.currentThread().getName()+" - "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//cnt++;
			
		}
	}

	

}
