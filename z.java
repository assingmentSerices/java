import java.util.scanner;

class abc
{
   
 public static void main(String[]args)
    { 
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      int num1=num;

  
      for(int i=1;i<=num;i++)
      {
                for(int j=1;j<=num;j++)
                {
                    if(i==1||i==num||j==num-i+1)
                System.out.print(" *");
                else
                System.out.print("  ");
                }
            
            
                System.out.println("");
      }             
    }
}