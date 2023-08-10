class Test{
	public static void main(String[] args) {
		Test t= new Test();
		t.fun();
	}
	public void fun()
	{
		Outer t=new Outer();
		Outer.Inner i=t.new Inner();
		i.m();
	}
}
class Outer{
	class Inner{
		public void m()
		{
			System.out.println("chetan");
		}

	}

}