import java.io.*;
class file
{
	public static void main(String[] args)throws Exception {
		FileWriter fw=new FileWriter("shivam.txt",true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] c=new char[]{'1','2','3'};
		bw.write(c);
		bw.newLine();
		bw.write("nfhwdfiwnjfgwimewkljfwoufk;we");
		bw.close();
		FileReader fr=new FileReader("shivam.txt");
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
		BufferedWriter bw1= new BufferedWriter(new FileWriter("satyam.txt",true));
		    bw1.write(s);
		    bw1.newLine();
		    bw1.flush();
		    bw1.close();
			System.out.println(s);
		}
		System.out.println("success");
         
	}
}