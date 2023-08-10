import java.util.*;
import java.util.Scanner;
class str
{
public static void main(String[] args) {
	System.out.println("enter no");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	ArrayList list=new ArrayList();
	for(int j=1;j<=i;j++)
	{
		System.out.println("enter string");
	 	String s=sc.nextLine();
		list.add(s);
	}
	Iterator itr=list.iterator();  
   while(itr.hasNext()){  
   System.out.println(itr.next());  
    }  
	System.out.println(list);
}
}