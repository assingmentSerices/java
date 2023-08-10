
class UnderAgeException extends Exception
{
	UnderAgeException(String msg)
	{
		super(msg);
	}
}
class Costomexception
{
	public static void  validateAge(int age)  throws UnderAgeException 
	 {
		if(age<=18)
		{
			throw new UnderAgeException("enjoy");
		}
	}



public static void main(String[] args) 
{
	int age=19;
	try
	{
		validateAge(age);
	}
	catch(UnderAgeException e)
	{
		e.printStackTrace();
	}
	System.out.println("vote");
}
}