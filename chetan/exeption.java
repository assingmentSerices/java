import java.util.*;
{
	public static void main(String[] args)
	 {
		System.out.println("start MAIN");
		try{
			int a=Integer.parseInt(args[0]);
			System.out.println(a/10);
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
	}
}