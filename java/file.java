import java.io.*;
class Copy
{
  public static void main(String jk[])throws Exception
  {
  	BufferedReader br=new BufferedReader(new FileReader("satyam.txt"));
  	

  	FileWriter fw=new FileWriter("final.java");
  	BufferedWriter bw1=new 	BufferedWriter(fw);
    String s1,s2;
    while((s1=br.readLine())!=null)
    {
    boolean b=true;
     BufferedReader br1=new BufferedReader(new FileReader("shiavm.txt"));
     while((s2=br1.readLine())!=null)
    	{
        if(s1.equals(s2))
        {
        	b=false;
          bw1.write(s1);
        
        	break;
        }
       }

       if (b==true) 
       {
        System.out.println(s1+" "+s2);		
        bw1.write(s1);	 	
    	bw1.newLine();
    	}
    
     }
      bw1.close();

  }	
}