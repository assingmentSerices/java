import java.io.*;
class file
{
	public static void main(String[] args)throws Exception {
		//FileReader fr=new FileReader("inner.java");
		FileReader fi=new FileReader("satyam.JPG");
		int a;
		while((a=fi.read())!=-1)
		{

		FileWriter fw = new FileWriter("rahul",true);
		BufferedWriter
		fw.write(a);
		fw.flush();
		 fw.close();
			//System.out.print((char)a);
		}
       
		

	}
}