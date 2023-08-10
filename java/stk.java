import java.util.Scanner;
class stk
{
	static final int size=30;
	int a[]=new int[size];
	int   top =-1;
	/*stk()
	{
		top=-1;
	} */ 
	public void push()
     {
        int v;
        Scanner sc=new Scanner(System.in);
    	if(top>=size-1)
  		  System.out.println("stake is full");
  	    else
  	     {
          System.out.println("enter no");
		  v=sc.nextInt();
       	  a[++top]=v;
  		  System.out.println("suscess:"+a[top]);
  	      }
  	  }
     public void pop()
      {
     	if(top==-1)
  		  System.out.println("stake is empty");
  	    else
  		  System.out.println("suscessful removed:"+a[top--]);  		
      }

      public void peak()
      {
     	if(top==-1)
  		  System.out.println("stake is empty");
  	    else
  		  System.out.println("suscessful removed:"+a[top]);  		
      } 
      public void show()
       {
    	 if(top==-1)
  		   System.out.println("stake is empty");
  	     else
  	      {
  		   for(int i=top;i>=0;i--)
           System.out.println("value is:"+a[i]);
  		  } 
       }
}

class satyam
{
	public static void main(String[] args) {
		stk s=new stk();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("\n 1 for push\n 2 for pop\n 3 for show\n 4 exit\n 5 for peak\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:s.push();
				       break;
				case 2:s.pop();
				       break;
				case 3:s.show();
				       break;
				case 4:System.exit(0);
				case 5:s.peak();
				       break; 
				default:System.out.println("wrong choice");
				        break;

			}
		}
	}
}