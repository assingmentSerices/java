import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
     	Scanner scan=new Scanner(System.in);
     	String s=scan.nextLine();
     	//System.out.println(s);
	
	char ch=s.charAt(0);
	int j=s.length()-1;
	int f=0;
	for(int i=0;i<j;i++)
{
	if(s.charAt(i)==s.charAt(j--))
	{
		f=1;
	}
	else
		System.out.println(s+" is not palindrome");
	    break;
	
}
if(f==1)
{
	System.out.println(s+" is a palindrome.");
}

}
}
