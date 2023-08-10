import java.util.Scanner;
class table
{
	public static void main(String[] args) {
		int n,n1,i,j,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no:");
		n=Integer.parseInt(s.next());

		n1=Integer.parseInt(s.next());
		for(i=1;i<=10;i++)
		{
			if(n>n1)
				{	
			    b=n;
				n=n1;
                n1=b;
                }
                
			for(j=n;j<=n1;j++)
			{
				
				System.out.print(i*j +"\t");
            }
			System.out.println("");
		}
	}
}