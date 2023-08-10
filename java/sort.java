import java.util.*;
import java.util.Scanner;
class str
{
public static void main(String[] args) {
	System.out.println("enter no");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	ArrayList<String>list=new ArrayList<String>();
	for(int j=0;j<=i;j++)
	{
		System.out.println("enter string");
		String s=sc.nextLine();
		list.add(s);
	
	}
	Collections.sort(list);
	  //System.out.println(list);  
	for(String s:list)
	{
   System.out.println(s);  
    }  
	//System.out.println(list.size());
}
}