import java.io.*;
import java.io.*;
class Test
{
	public static void main(String[] args) {
		
		File f= new File("ac.txt");
		f.createNewFile();
		System.out.println("file created");
	}
}