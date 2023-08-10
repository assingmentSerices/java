class myThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"myThread");
	}	
	}
	class Test
	{
public static void main(String[] args) {
	myThread m=new myThread();
	m.start();
		System.out.println(Thread.currentThread().getName()+"main");

}
	}
