class Test
{
	class Inner
   {
	public void fun()
	{
		System.out.println("hello");
	}
}
	public static void main(String[] args) {
		Test t=new Test();
		//Inner i= t.new Inner();
        // i.fun();
        t.see();

   
	}
	public void see()
	{
		 this.new Inner().fun();

	}
}