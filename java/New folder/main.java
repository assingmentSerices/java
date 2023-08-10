import java.util.Scanner;
class s
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String j=sc.nextLine();
		String ss="";
		for(int i=j.length();i>0;i--)
		{
         ss=ss+j.charAt(i-1);
		}
		System.out.print(ss.equals(j));
	    
	}
}