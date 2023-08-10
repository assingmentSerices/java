import java.util.Scanner ;
class bigger
{
	public static void main(String[] args)
	{
		
         Scanner s=new Scanner(System.in);	
		System.out.print("enter the number");
		int num1=s.nextInt();
		//Scanner s=new Scanner(System.in);
		System.out.print("enter the number");
		int num2=s.nextInt();
		//Scanner s=new scanner(System.in);
		System.out.print("enter the number");
		int num3=s.nextInt();
		if((num1>num2) &&(num1>num3))
		{
			System.out.println(num1+"is bigger");
		}
		else if((num2>num1) &&(num2>num3))
        {
			System.out.println(num2+"is bigger");
		}
		else
		{
			System.out.println(num3+"is bigger");
		
		}
		
		}


		}
	
