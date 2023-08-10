import java.util.Scanner;
class upper
{
		class inner
		{
         class inner2
         {
         	public void m1()
         	{
         		System.out.println("satyam");
         		Scanner sc=new Scanner(System.in);
         		System.out.println("enter a no.");
         		int n=sc.nextInt();
         		for(int i=1;i<=n;i++)
         		{
         			for(int j=1;j<=n;j++)
         			{
         				if()
         					System.out.print("* ");
         				else
         					System.out.print("  ");
         			}
         			System.out.println();
         		}
         	}
         }
         public void m2()
         {
         	System.out.println("shivam");
         }

		}
		public void m3()
		{
			System.out.println("pink");
		}
}
class lower
{
	public static void main(String[] args) {
		new upper().new inner().new inner2().m1();
		new upper().new inner().m2();
		new upper().m3();
         upper t=new upper();
		//t.m1();
	//	t.m2();
		t.m3();
		System.out.println("pink2");
	}
}