import java.util.Scanner;
class swastic
{
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();
		String b=sc.nextLine();
		float c=sc.nextFloat();			
		System.out.println(b+"1234567890");
		System.out.println("float value"+c);

		//int c=sc.nextInt();
		if(a%2==0)
			a=a+1;
		for(int i=1;i<=a;i++)
		{
			for (int j=1;j<=a;j++ )
			{
				if(i==a/2+1||j==a/2+1||i==1&&j>a/2+1||j==a&&i>a/2+1||i==a&&j<a/2+1||j==1&&i<a/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			  System.out.println("");
		}
	}
}