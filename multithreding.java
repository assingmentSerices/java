class mythread extends Thread 
{
    public void run()
    {
      for(int i=0;i<5;i++)
      {
        System.out.println(Thread.currentThread().getName()+i);
      }
    }
} 
class test
{
    public static void main(String[]args)
    {

        mythread t=new mythread();
        t.start();
    
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }    
    }
}