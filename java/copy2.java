import java.io.*;
class satyam
{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("satyam1.JPG");
		BufferedReader br=new BufferedReader(fr);
		String s;
        while((s=br.readLine())!=null)
        {
        	//System.out.println(s);
        	FileWriter fw=new FileWriter("satyam.JPG",true);
        	BufferedWriter bw=new BufferedWriter(fw);
        	bw.write(s);
        	bw.newLine();
        	//bw.write(s);
        	//bw.newLine();
        	bw.close();
        	       	
        }
     
 	}
}