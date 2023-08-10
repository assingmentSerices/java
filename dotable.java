import java.util.Scanner;

	class dotable
	{
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
	      	System.out.print("enter the number");
	       int num=s.nextInt();
	        int i=1;
	        do
	        {
	        	System.out.println(i*num);
	        	i++;
	        }while(i<=10);
		}
	}
