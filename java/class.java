 class p1
{
	public void m1()
	{
		System.out.println("satyam");
	}
	//p1 tt=new p1();
}
class p2 extends p1
{
	public static void main(String[] args) {
		p2 t=new p2();
		t.m1();
		p1 t1=new p1();
          t1.m1();
	}
	private void m2()
	{
		System.out.println("shivam");
	}
}