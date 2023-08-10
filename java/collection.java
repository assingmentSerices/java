import java.util.*;
import java.util.Scanner;
class collection
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	int i1=sc.nextInt();
	ArrayList al=new ArrayList();
	for(int j=0;j<=i1;j++)
	{
		String s=sc.nextLine();
		al.add(s);
	}
	for(String p:al)
	{
		System.out.println(p);
	}
	Iterator i=al. iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}