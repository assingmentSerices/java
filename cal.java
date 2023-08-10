import java.util.*;
class calculator
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	System.out.println("enter the number");
	System.out.println("Addition");
    System.out.println("substrication");
    System.out.println("multiflication");
    System.out.println("division");
    System.out.println("enter your choice");
    int choice=s.nextInt();
     switch(choice)
     { 
    case 1:
    {
       int a=s.nextInt();
       int b=s.nextInt();
     System.out.println(a+b);
     break;  
    }
    case 2:
    {
    	int a=s.nextInt();
       int b=s.nextInt();
     System.out.println(a-b);
     break;	
    }
    case 3:
    {
    	int a=s.nextInt();
       int b=s.nextInt();
     System.out.println(a*b);	
     	break;
    }
    case 4:
	{
		int a=s.nextInt();
       int b=s.nextInt();
     System.out.println(a/b);	
     	break;
	}
	case 5:
	{
		System.out.println("exit");
	}


    }



	}

	}
