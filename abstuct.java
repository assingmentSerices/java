   abstract class Show
{
abstract void walk();
}

class Seee extends Show{
	public void walk()
	{
	System.out.println("hii");
}
}

class DDD extends Show
{
	public void walk()
	{


	System.out.println("Byyy");  
}
}
class FFF extends Show
{
	public void walk()
	{


	System.out.println("Hello");  
}
}
 class Test
 {
public static void main(String[] args) {
	Seee s=new Seee();
	DDD d=new DDD();
	FFF f=new FFF();
     s.walk();
     d.walk();
     f.walk();
     
}
}