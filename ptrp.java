import java.util.Scanner;
class abc
{
    public static void main(String[]args)
    { 
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      
      

      for(int i=0;i<=num;i++)
      {
                for(int j=0;j<=num;j++)
                {
              if(j==0||i==0||i==3||j==num&&i<=num/2)
                System.out.print(" *");
                else
                System.out.print("  ");
                }
            
            
                System.out.println("");
      }             
    }
}