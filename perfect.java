import java.util.Scanner;
class perfect{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int i,sum=0;
  for(i=1;i<=n/2;i++){
  	if(n%i==0)
  		sum=sum+i;
  }
  if(sum==n)
  	System.out.println("this number is a perfect");
  else

     System.out.println("this number is a not perfect");
}
}