import java.io.*;
class print1{
	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("satyam1.jpg");
	   BufferedReader br=new BufferedReader(fr);
	   BufferedWriter bw=new BufferedWriter(new FileWriter("final.txt"));
	    bw.write(100);
	    bw.close();
	    System.out.println("succcess");
	    String s;
	     PrintWriter p=new PrintWriter("final1.jpg");
	    while((s=br.readLine())!=null)
	    {
	   
	    p.write(s);
	    
		}
		p.close();
	}
              
}