import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class CollectionInterfaceExample {
	public static void main(String[] args)throws FileNotFoundException {
		
		//Abstract Collection is a protected class So we cannot instantiate it.
		AbstractCollection<Object> absCollection=new ArrayList<Object>();
		
		//File Line.
		File filename=new File("C:\\Users\\ariha\\Desktop\\Document.txt");
		Scanner sc=new Scanner(filename);
		String text="";
		
		//Iterating through the File.
		while(sc.hasNextLine())
		{
			text=sc.nextLine();
			System.out.println(text);
		}
		sc.close();
	}
}
