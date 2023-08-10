import java.io.*;
class seri{
	public static void main(String[] args)throws Exception {
      MS.println("con","hello");

	}
}
class MS{
	public static void println(String file,Object ob)throws Exception
	{
		PrintWriter p=new PrintWriter(file);
		p.println(ob);
		p.close();
	}

}