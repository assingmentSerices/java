abstract class Inter
{
  public abstract void fun();
}
class test
{
	 public static void main(String[] args)
	 {
		Inter i=new Inter()
		{
			public void fun()
			{
				System.out.println("chetan");
			}
		};
		i.fun();
		System.out.println(i);
	}
	}