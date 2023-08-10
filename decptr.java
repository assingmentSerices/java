class sheetp
{
	public static void main(String[] args)
	{
		import java.util.Scanner;

	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	for(int j=n-i;j>=1;j--){

	System.out.print("@");
	}
	System.out.println("");
	}
}
}