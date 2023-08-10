class Test{
	public static void main(String[] args) {
Outer t=new Outer();
Outer.Inner i=t.new Inner();
i.m();
i.n();
i.v();
i.y();
		
	}
}
	class Outer {
		class Inner
		{
           public void m()
           {
           	System.out.println("chetan");
           }
		
		
			public void n()
			{
				System.out.println("akul");
			}
			public void v()
			{
				System.out.println("sagar");
			}
			public void y()
			{
				System.out.println("sachin");
		}
	}
}

	
