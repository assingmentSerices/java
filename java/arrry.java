import java.util.Scanner;
class array
{
 public static void main(String[] args)throws Exception {
 	int a[][]=new int[10][20];
 	Scanner sc=new Scanner(System.in);
 	a[9][15]=100;
 	for(int i=0;i<=a.length;i++)
 	//a[i]=sc.nextInt();	
 for(int j=0;j<=a.length;j++)
 	System.out.println(a[i][j]);
}
 }