import java.io.*;
class Text
{
	
   public void fun(String s)
   {
      File f=new File(s);
      if(f.isDirectory())
      {

         String list[] = f.list();
         for(String name:list)
         {
            File f1 = new File(f,name);
            if(f.isDirectory())
            {
               System.out.println(name+" => "+(f1.isDirectory()?"Folder":"File"));
               if(f1.isDirectory())
                  fun(f+"\\"+name);
            }
         }
      }

   }
   public static void main(String[] args) 
   {
      File f = new File("d:\\chetjava");
      Text t = new Text();
      if(f.isDirectory())
      {
         String list[] = f.list();
         for(String name:list)
         {
            File f1 = new File(f,name);
            if(f.isDirectory())
            {
               System.out.println(name+" => "+(f1.isDirectory()?"Folder":"File"));
               if(f1.isDirectory())
                  t.fun(f+"\\"+name);
            }
         }
      }
   }
}