import java.util.Scanner;
class prime
{
	public static void main(String[] args) 
	{   
		System.out.println("enter a no."); 
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the prime no are-:");
        for(int i=1;i<=n;i++)
		{
             int c=0;
			for(int j=2;j<=i/2;j++)
			{
               if(i%j==0)
               {
                 c++;
                 break;
               }
            }   
               if(c==1)
               continue;
               else
               System.out.println(i);
		}
	}
}