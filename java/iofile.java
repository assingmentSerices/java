import java.io.*;
class file
{    
	 int count=0;
	public static void main(String[] args) throws Exception{
		file fi=new file();
		fi.m1();

    }
public void m1()
{
        File f=new File("d:/java//");
		if(f.exists())
		{
	     if(f.isFile())
		System.out.println("file exists");
		else
           { 
            String list[]=f.list();
            for(String s:list)
            {
            	if(f.isDirectory())
            	{
            		m1();
            		// File f=new File("");
            	     //String list[]=f.list(); 
            		
            	}
            	else
            	{
                  System.out.println(s);
                }
            }
                System.out.println("cout"+list.length);  
		    
		   }
        }
        else
        	System.out.println("not found");
	
}
}