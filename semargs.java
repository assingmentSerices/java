import java.io.*;
class test
{
	public static void main(String[] args)throws Exception
	{
		File f=new File("f3.txt");
		f.createNewFile();


		PrintStream p=new PrintStream("f3.txt");
		FileReader fr=new FileReader("f1.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			FileReader fr2=new FileReader("f2.txt");
			BufferedReader br2=new BufferedReader(fr2);
			String str;
			while((str=br2.readLine())!=null)
			{
				if(s.hashCode()=str.hashCode())
			{
				p.println(s);
				break;
			}
		}
		
	}
	p.close();
}}