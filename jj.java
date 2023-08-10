
 class G extends Thread 
{
    public void run()
    {
      for(int i=0;i<5;i++)
      {
        System.out.println(Thread.currentThread().getName()+"chetan");
      }
    }
} 


class mythread extends Thread 
{
    public void run()
    {
      for(int i=0;i<123;i++)
      {
      try
      {
        Thread.sleep(1000);
    }
              catch(Exception e)
      {

      }

        System.out.println(Thread.currentThread().getName()+i);
      }
    }
}




class test
{
    public static void main(String[]args)
    {

        mythread t=new mythread();
                mythread c=new mythread();
         // ythread v=new mythread();
         // G a=new G();

       c.start();
        //v.start();
        //a.start();
    
        for(int i=0;i<123;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        } 
        System.out.println(Thread.currentThread().getName()+"Akul");   
    }
}