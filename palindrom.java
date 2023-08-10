class palindrom{
	public static void main(String[] args){
		int n=121,sum=0,r;
		int tem=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(tem==sum)
			System.out.println("this number is palindrom");
else
       System.out.println("this number is not palindrom");

	}
		}
