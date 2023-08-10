

class TestName
{
public static void main(String[] args) throws Exception
{
	Class c= Class.forName(args[0]);
	Rbi ob=(Rbi) c.newInstance();
	ob.getInfo();
}
}
interface Rbi
{
	public void getInfo();
}
class Sbi implements Rbi
{
	static
	{
		System.out.println("sbi static");
	}
	public void getInfo()
	{
		System.out.println("state bank of india");
	}
}
	class Boi implements Rbi
{
	static
	{
		System.out.println("boistatic");
	}
	public void getInfo()
	{
		System.out.println("Bank of india");
	}
}
	class Pub implements Rbi
{
	static
	{
		System.out.println("pub static");
	}
	public void getInfo()
	{
		System.out.println("Punjab bank");
	}
}
	class Bado implements Rbi
{
	static
	{
		System.out.println("bado static");
	}
	public void getInfo()
	{
		System.out.println(" bank of bado");
	}
 }   
    class Union implements Rbi
{
	static
	{
		System.out.println("union static");
	}
	public void getInfo()
	{
		System.out.println("  union bank ");
	}
}
	class Shreeram implements Rbi
{
	static
	{
		System.out.println("shreeram static");
	}
	public void getInfo()
	{
		System.out.println("finacial supporter");
	}
}
