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
              if(i==0||j==3||i==num)
                System.out.print(" *");
                else
                System.out.print("  ");
                }
            
            
                System.out.println("");
      }             
    }
}