
public class SimpleThread {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Task t1= new Task("t1");
		Task t2= new Task("t2");
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		t1.start();
		//t1.join();
		t2.start();
		
		}

}
