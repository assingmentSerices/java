class satyam
{
	satyam()
	{
		System.out.println("constcuter");
       //  satyam s=new satyam();
	}
	{
		System.out.println("non-static");
	}
	static{
		System.out.println("static-block");
	}
	satyam(int a)
	{
		System.out.println("100");

	}
	{
		System.out.println("non");
	}
	static{
		System.out.println("static");
	}
	public static void main(String[] args) {
		
		System.out.println("dhoka");
		satyam s=new satyam(10);
		s.system();
		System.out.println("main");
	
		
	}
	public void system()
	{
		System.out.println("mathod m1");
	}
	
}