import java.util.*;

	class test
	{
	public static void main(String[] args)
	 {
	 	System.out.println("hello1");
		System.out.println("hello2");
		try{
			
			System.out.println(args[3]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("value from cmd");
		}
		catch(NumberFormatException e)
		{
			System.out.println("0 se 9 tak likhna he");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0 se divide nhi krna he");
		}
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");
	}
}
