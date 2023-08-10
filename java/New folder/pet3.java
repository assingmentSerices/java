import java.util.Scanner;
class a
{
	void reverse(int a[],int n)
	{
		int b[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=a[i];
			j=j-1;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(" "+b[k]);
		}
	}
	public static void main(String[] args) {
		a l=new a();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int r=0;r<s;r++)
        {
        	arr[r]=sc.nextInt();
        }
        l.reverse(arr,arr.length);
	}
}