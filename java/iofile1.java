import java.io.*;
import java.util.Scanner;
class Satyam
{    
	public static void main(String []args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Satyam sa=new Satyam();
		sa.m1(s);
		//fi.m2();
		//fi.m3();

    }
   public void m1(String s)throws Exception
   {  
       System.out.println(s+"drive contant are:-");
       System.out.println();
        File f=new File(s);
		if(f.exists())
		{
	     if(f.isDirectory())
	       {
                
             String []list=f.list();
             for(int i=0;i<list.length;i++)
              {
            	File f1=new File(f.getPath()+"\\"+list[i]);
                if(f1.isDirectory())
            	{ 

            		System.out.println(list[i]+"is folder it's inside are");
            		m1(f.getPath()+"\\"+list[i]);	
            	}
            	else
                  System.out.println(list[i]);
                
              } 
		    System.out.println();
		   }
        }
	}
}