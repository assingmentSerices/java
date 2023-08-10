import java.util.Scanner;
class Arm
{
	public  static int sumclosetozero(int a[])
	{
		int sum=0,max=0;
		int []abs=new int[a.length];
		for (int i=0;i<a.length;i++ ) {
			abs[i]=a[i];
			abs[i]=(abs[i]>0)?abs[i]:abs[i]*(-1);
			max=(i==0)?abs[0]:(abs[i]>max)?abs[i]:max;
		}
		for(int i=0;i<a.length;i++){
			sum+=(abs[i]!=max)?a[i]:0;
		return sum;
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp_array[]={-5,-3,10};
         System.out.println(sumclosetozero(temp_array));
		
    }

}