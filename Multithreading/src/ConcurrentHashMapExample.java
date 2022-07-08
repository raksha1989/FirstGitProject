import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{
	
	static ConcurrentHashMap<String,String> chm;
	ConcurrentHashMapExample()
	{
		chm= new ConcurrentHashMap<>();
		chm.put("k1", "A");
		chm.put("k2", "B");
		chm.put("k3", "C");
		chm.put("k4", "D");
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
		chm.put("K5", "ABC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new ConcurrentHashMapExample();
		t1.start();
		
		Set<String> s= chm.keySet();
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String st=(String) itr.next();
			System.out.println(st+" "+chm.get(st));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
