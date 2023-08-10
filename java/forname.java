import java.util.*;
class aaaa
{
	public static void main(String[] args) throws Exception {
          // class d=new class();
		 class s=class.forName(args[0]);
         System.out.println(s.NewInstance());		
	}
}
class Sbi
{
	static{
		System.out.println("sbi loded");
	}
	public void m1()
		{
			System.out.println("forname");
		}
}