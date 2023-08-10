import java.io.*;
import java.util.*;
class Test
{
	public static void main(String[] args)
	throws Exception {
		ToDolist td=new ToDolist();
		td.add("java","ToDolist");
		//td.add("physics","prictical likhna he");
		td.show();
	}
}
class ToDolist
{
	public  void add(String head,String task)throws Exception
	 {
		Task t=new Task(head,task);
		ArrayList al= readFile();
		if(al==null)
		{
			al=new ArrayList();
		}
		al.add(t);
		writeFile(al);
	}
	public void show()throws Exception
	{
		ArrayList al=readFile();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<al.size();i++)
		{

			Task t=(Task)al.get(i);
			System.out.print(i+1+":"+t.gethendling());
			System.out.print(""+t.getTask());
			System.out.println(","+t.getstatus());
        }
			System.out.println("====================================");
			System.out.println("1.delete Task");
			System.out.println("2.updateTask");
			System.out.println("3.updatestatus");
			System.out.println(" enter your choice");
			int ch=scan.nextInt();
			if(ch==1)
				deleteTask();
			else if(ch==2)
				updateTask();
				else if(ch==3)
				updateStatus();		
	}
		public void deleteTask()throws Exception
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter  u are delete Task");
			int id =scan.nextInt();
			ArrayList al=readFile();
			al.remove(id-1);
			writeFile(al);
			show();
		}
		public void updateTask()throws Exception
		{
			Scanner scan=new Scanner (System.in);
			System.out.println("enter updateTaskid");
			int id =scan.nextInt();
			ArrayList al=readFile();
			Task t=(Task)al.get(id-1);
			t.setTask("update Task");
			writeFile(al);
			show();
		}

		public void updateStatus()throws Exception
		{
			Scanner scan=new Scanner (System.in);
			System.out.println("enter updatestatusid");
			int id =scan.nextInt();
			ArrayList al=readFile();
			Task t=(Task)al.get(id-1);
			t.setStatus("update status");
			writeFile(al);
			show();
		}



	public void writeFile(ArrayList al)throws Exception
	{
		FileOutputStream fos=new FileOutputStream("ToDolist.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}
	public  ArrayList  readFile()throws Exception
	{
	try
	{
		FileInputStream fis=new FileInputStream("ToDolist.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList al=(ArrayList)ois.readObject();
		return al;
	}
	catch(Exception e)
	{
		return null;
	}
}
}
class Task implements Serializable
{
	String headling,task,status;
	Task(String headling,String task)
	{
		this.headling=headling;
		this.task=task;
		this.status="not done";

	}
	public void sethendling(String headling)
	{
		this.headling=headling;
	}
	public void setTask(String task)
	{
		this.task=task;
	}
	public void setStatus(String status)
	{
		this.status=status;
	}
	public String gethendling()
	{
		return headling;
	}
	public String getTask()
	{
		return task;
	}
	public String getstatus()
	{
		return status;
	}
}



