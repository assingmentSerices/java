class abc
{
    public static void main(String[]args)
    { 
      Scanner sc = new Scanner(System.in);
      int num=sc.nextIimport java.util.Scanner;
nt();
      int num1=num;
      

      for(int i=0;i<=num;i++)
      {
                for(int j=0;j<=num;j++)
                {
              if(j==0||i==num||j==num)
                System.out.print(" *");
                else
                System.out.print("  ");
                }
            
            
                System.out.println("");
      }             
    }
}