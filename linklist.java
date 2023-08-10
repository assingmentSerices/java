class Node
{
	object data;
	Node next;
	Node(object data)
	{
		this data=data;
		next=NULL;	
	}
}
class LinkList
{
	Node struct=NULL;
	public boolean addFirst(object data)
	{
		Node temp=new Node(data);
		if(start==NULL)
		{
			start=temp;
		}
		else
		{
			temp.next=start;
		}
	}
	return true;
}
public void print()
{
	Node t=start;
	while(t!=NULL)
	{
		System.out.print(t.data+"->");
		t=t.next;
	}
}