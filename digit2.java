import java.util.Scanner;
class abc
{
    public static void main(String[]args)
    { 
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      int num1=num;
      

      for(int i=0;i<=num;i++)
      {
                for(int j=0;j<=num;j++)
                {
              if(j==num||i==0||i==num||i==3||j==0)
                System.out.print(" *");
                else
                System.out.print("  ");
                }
            
            
                System.out.println("");
      }             
    }
}