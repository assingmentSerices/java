import java.util.Scanner;
class Age
{
	public static void main(String[] args) {
		int i;
         System.out.println("enter you age");
         Scanner sc=new Scanner(System.in);
          i=sc.nextInt();
         try {
         	    
               System.out.println(i);
             }
         catch(Exception e)
         {
         	System.out.println("age is not nagetive");
         }
          	
	}
		
	
}
