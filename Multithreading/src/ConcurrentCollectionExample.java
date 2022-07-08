import java.util.ArrayList;
import java.util.Iterator;

class ConcurrentCollectionExample extends Thread
{
	static ArrayList<String > al;
	ConcurrentCollectionExample()
	{
		al= new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C")	;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.add("D");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConcurrentCollectionExample li= new ConcurrentCollectionExample();
		Thread t1= new ConcurrentCollectionExample();
		t1.start();
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
	
	
	
	
}

