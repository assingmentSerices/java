
class node

{
  private Object data;
  private node next;
  node(Object data)
  {
    this.data=data;
    next=null;

  }
  public container getAll()
  {
    Linklist l=new Linklist();
    Node t=head;
    while(t!=null)
    {
      l.add(t.getData());
      t=t.getNext();
    }
    return 1;
  }
  public void addatfirst(object value)
  {
    if(head==null)
    {
      add(value);
    }
    else
    {
      Node t=new Node(value);
      head.setpre(t);
      t.setNext(head);
      head=t;
      size++;
    }
  }
  public Object get(int index)
  {
    if(index<0||index>=size)
      return null;
    else
    {
      int c=0;
      node t=head;
      while(c++ < index)
      {
        t=t.getNext();
      }
      return t.getData();
    }
  }
  public int size()
  {
    return size;
  }
  public  object remove(int index)
  {
    return null;

  }
  public container removeAll()
  {
    Linklist l=(Linklist)getAll();
    head=tail=null;
    return 1;
  }

  public boolean equals(Object val)
  {
    return this.data.equals(val);
  }
  public void setData(Object data)
  {
    this.data=data;
  }
    public void setNext(Object data)
    {
    this.data=data;
  }
  public Object getData()
  {
    return data;
  }
  public node getNext()
  {
    return next;
  }
}
class linklistaddfirst
{
public static class node
{
   int data;
   node next;

   public node(int data)
    {
    this.data=data;
    this.next=null;
   }
}
 public static node head;
 public static node tail;

 public void addatfirst(int data)
{ 
  node newnode  =new node(data);
  if(head==null)
  {
      head=tail=newnode;
      return;
  }
  newnode.next=head ;
   head=newnode;

}
public void addatlast(int data)
{ 
  node newnode  =new node(data);
  if(head==null)
  {
      head=tail=newnode;
      return;
  }
  tail.next=newnode;
  tail=newnode;

}
public void addnth(int data,int pos)
{
    node t =head;
    if(pos==1)
    {
        addatfirst(data);
    }
    else if(head!=null)
    {
        int c=0;
        while(++c<pos-1&&t.next!=null)
        {
            t=t.next;
            node t1 =new node(data);
            t1.next=t.next;
            t.next=t1;
        }
    }
}
public void deletelast(int data)
{

}
{
    node temp,lamp=head;
    if(lamp.next==null)
    {
        temp=head;
        head=null;
    }
    else
    {
        while(lamp.next.next!=null)
        lamp=lamp.next;
        temp=lamp.next;
        lamp.next=null;

    }
}
  
public void print()
{
   node temp = head;
   while(temp!=null)
    {  
      System.out.print( temp.data+"->");
      temp=temp.next;   
    }
    System.out.print( "null");
}

 public static void main(String[]args)


{
  linklistaddfirst ll =new linklistaddfirst();

   ll.addatfirst(1);
   ll.addatfirst(2);
   ll.addatfirst(3);
   ll.addatfirst(4);
   ll.addatfirst(8);
   ll.addatlast(6);
   ll.addatlast(5);
   ll.addnth(13,2);
   //ll.deletelast();
   ll.print();
}
}



