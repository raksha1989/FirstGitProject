import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentSerializeMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		FileOutputStream fos= new FileOutputStream("D://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1= new Student(101,"Raj",70);
		oos.writeObject(s1);
		
		System.out.println("Done");
		oos.close();

		FileInputStream fis= new FileInputStream("D://abc.txt");
		ObjectInputStream  ois= new ObjectInputStream(fis);
		
		Student s= (Student) ois.readObject();
		System.out.println(s);
		
		ois.close();*/
		

		FileOutputStream fos= new FileOutputStream("D://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Student> al= new ArrayList<>();
		
		al.add(new Student(101,"Raj",70));
		al.add(new Student(102,"Riya",65));
		al.add(new Student(103,"Ramesh",60));
		al.add(new Student(104,"Ram",50));
		al.add(new Student(105,"Raja",55));
		
		for(Student s:al)
		{
			oos.writeObject(s);
		}
		
	
		System.out.println("Done");
		oos.close();

		FileInputStream fis= new FileInputStream("D://abc.txt");
		ObjectInputStream  ois= new ObjectInputStream(fis);
		//Student s;
		ArrayList<Student> al1= new ArrayList<>();
		boolean cont= true;
		while(cont)
		{
			Student s=null;
			try {
				s = (Student) ois.readObject();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			if(s!=null)
				al1.add(s);
			else
				cont=false;
			//System.out.println(s);
		}
//		/ois.close();
	System.out.println(al1);
		//ois.close();
	}

}
