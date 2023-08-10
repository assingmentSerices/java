import java.util.Scanner;
class prime{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int flag=0,i;
  for(i=2;i<=n/2;i++)
  {
  if(n%i==0)
  {
  	
  	
  	System.out.println("this is not prime");
  	flag =1;

  	break;
  }
  }	

  if(flag==0)
  	System.out.println("this is  prime");
  //else

}
}