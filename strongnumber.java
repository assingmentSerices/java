import java.util.Scanner;
class strongnumber{
	static int fact(int num){
	int f=1;
	for(int i=1;i<=num;i++){
	f=f*i;
	}
	return f;
}
 public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int num,sum=0;
	System.out.print("enter the number to chek= ");
	num=s.nextInt();
	int m=num;
	while(num!=0){
	int digit=num%10;
	sum+=fact(digit);

	
	num/=10;
	}
	if(m==sum)
	System.out.print("this number is strong");
	else
	System.out.print("this number is not strong");
}
}