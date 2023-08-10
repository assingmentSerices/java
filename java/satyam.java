import java.util.Scanner;
class table
{
	public static void main(String[] args) {
		int n,n1,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no:");
		n=Integer.parseInt(s.next());

		n1=Integer.parseInt(s.next());
		for(i=1;i<=10;i++)
		{
			for(j=n;j<=n1;j++)
				System.out.print(i*j +"\t");
			System.out.println("");
		}
	}
}