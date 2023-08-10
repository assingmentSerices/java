import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
	System.out.print("enter the number to chek= ");
	int n=scan.nextInt();
    int s=0,r=0,t=n;
    int c=count(n);
	while(n!=0)
{
	r=n%10;
	s+=power(r,c);
	n/=10;

}
	if(s==t)
	{
	System.out.println(t+"this number is armstrong");
}
	else
	System.out.println(t+"this number is not armstrong");
 }
 static int power(int n,int p)
 {
 	int f=1;
 	for(int i=1;i<=p;i++)
 	{
 		f=f*n;
 	}
 	return f;
 }
 static int count(int n)
 {
 	int c=0;
 	while(n!=0)
 	{
 		n/=10;
 		c++;
 	}
 	return c;
 	}
 }
