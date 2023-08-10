interface Overload
{
	 void m();
}		


class O implements Overload
{
	void m(){System.out.println("afdasdfda");}
	public static void main(String[] args) {	
	
	O s=new O();
	s.m();
	}
}