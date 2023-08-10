import java.io.*;
class file
{
	public static void main(String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader("satyam.txt"));
		FileWriter fw=new FileWriter("final.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s1;
		boolean f;
		while((s1=br.readLine())!=null)
		{
			String s2;
			f=false;
			BufferedReader br1=new BufferedReader(new FileReader("shiavm.txt"));
			while((s2=br1.readLine())!=null)
             {
             	if(s1.equals(s2))
             	{
             		f=true;
             		break;
             	}

             }
             if(f==false)
             {
             	System.out.println(s1+" "+s2);
             	bw.write(s1);
             	bw.newLine();
                bw.flush();
             }
             	bw.close();
		}
       
	

	}
}