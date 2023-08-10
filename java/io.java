import java.io.*;
class file
{
	public static void main(String[] args) throws Exception{
		
	     File f=new File("abc.txt");
		if(f.exists())
		{
			if(f.isFile())
				System.out.println("file exists");
			else
				System.out.println("folder exists");
		}
		else
		 {
			f.createNewFile();
		    System.out.println("new file created");
         }
	}
}