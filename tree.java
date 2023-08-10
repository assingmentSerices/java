class node
{
	private Object data;
	private Node next,prev;
	Node(Object data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public Object setData(Object data)
	{
		this.data=data;
	}
	public void setNext(Node next) 
	{
		this.next=next;
	}
	public  void setPrev(Node prev)
	{
		this.prev=prev;
	}
	public Object getData()
	{
		return this.data;
	}
	public Node getNext()
	{
		return this.next;
	}
	public Node getPrev()
	{
		return this.prev;
	}
}
class treelinklist
{
	private Node head;
	treelinklist()
	{
		head=null;
	}
	public void add(object data)
	{
		if(head==null)
		{
			Node n=new Node(data);
			head=n;
		}
		else
		{
			add(data,head);
		}
	}
	public void add (object data,Node temp)
	{
		if(data.hashcode()<temp.getData().hashcode())
		{
			if(temp.getPrev()==null)
			{
				Node n=new Node(data);
				temp.setPrev(n);
			}
			else
			{
				add(data,temp.getPrev());
			}
		}
		else
		{
			if(temp.getNext()==null)
			{
				Node n=new Node(data);
				temp.setNext(n);
			}
			else
			{
				add(data,temp.getNext());
			}
		}
	}
	public void printdata()
	{
		if(head==null)
		{
			System.out.println("null");
		}
		else
		{
			printData(head);
		}
	}
	public void printData(Node temp)
	{
		if(temp.getPrev()!=null)
		{
			printData(temp.getPrev());
		}
		System.out.println(temp.getData());
		if(temp.getNext()!=null)
		{
			printData(temp.getNext());
		}
	}

}
class test
{

	 public static void main(String[] args) {
		Linklist l =new Linklist();
		l.add(new Emp("AAA",2000));
		l.add(new Emp("CCC",1000));
		l.add(new Emp("HHH",5000));
		l.add(new Emp("GGG",3000));
		Linklist.show();
		
	}
}
class Emp
{
	String name;
	Emp(String name)
	{
		this.name=name;
	}
	public int hashcode()
	{
		return name.hashcode();
	}
	public String tostring()
	{
		return name;
	}
}