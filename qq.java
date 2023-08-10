class test
{
	public static void main(String[] args)
	{
	   Outer o=new Outer();
        o.chetan();

	}
}
class Outer
{
	int i=40;
	public void chetan()
	{
		int i=30;
		class Inner
		{
			int i=20;
			public void sample()
			{
				int i=10;
				System.out.println("sample"+i);
				System.out.println("sample"+this.i);
				System.out.println("sample");
				System.out.println("sample"+Outer.this.i);
			}
		}
		Inner i1=new Inner();
		i1.sample();
		
	}
}