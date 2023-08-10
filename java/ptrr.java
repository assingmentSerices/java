import java.util.Scanner;
class ptr
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
        int i,j;
		    System.out.println("enter a no.");
			   int n=sc.nextInt();
			   for(i=1;i<=n;i++)
			   {
			   	for(j=1;j<=n;j++)
			   	{
			   		if(i+j>=n+1)
			   			System.out.print("  ");
			   		else
			   		    System.out.print("* ");
			   }
			   	System.out.println("");
               }
	}
}
