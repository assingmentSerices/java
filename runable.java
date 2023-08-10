class MyThreadRunable1 implements Runnable
{
	public  void run(){

		for(int i=0;i<=20;i++)

	{

		{
          System.out.println("sagar gandu");
		}
	System.out.println("I am  chetan kushwah");
    }
}
}
class MyThreadRunable2 implements Runnable
{
	public  void run(){
	for(int i=0;i<=20;i++)

	{
	System.out.println("I am  sagar ");
    }
}
}







class Test
{
	public static void main(String[] args) throws Exception
	{
	MyThreadRunable1 ttt1=new MyThreadRunable1();

	Thread gun1=new Thread(ttt1);

	MyThreadRunable2 eee2=new MyThreadRunable2();

		Thread gun2=new Thread(eee2);

       gun1.start();
       gun2.start();
		//ttt1.join();
		//eee2.join();
	}
}