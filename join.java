class MyThread extends Thread
{

	static Thread t;
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				t.join();
			}
			catch(Exception e)
			{
				System.out.println("sone do reeeee");
			}
			System.out.println(Thread.currentThread().getName()+"My Thread"+i);
		}
	}
	
}



class Test
{
	public static void main(String[] args) throws Exception
	{
		MyThread t=new MyThread();
		t.start();
		MyThread.t=Thread.currentThread();
		//t.join();
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"my Thread"+i);
		}
	}
}