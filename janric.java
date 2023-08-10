// import java.util.*;
// class chetan
// {
// 	public static void main(String[] args)
// 	{
// 	 Contains<Number>c1=new Contains<Number>();
// 	 c1.set(55);
// 	 Object o= c1.get();
// 	 System.out.println(o);	
// 	}
// }
// class Contains< T extends Number>
// {
// 	T value;
// 	public void set(T val)
// 	{
// 		value=val;
// 	}
//      public	T get()
//      {
//      	return value;
//      } 
// }
 
 import java.util.*;
 class chet
 {

 	public static void main(String[] args) 
 	{
 		Arraylist<Integer>al=new Arraylist<Integer>();
 		al.add(100);
 		al.add(200);
 		al.add(300);
 		al.add("chetan");
 		al.add(400);
 		SendTO(al);
 	}
 	public static void SendTO(Arraylist al)throws Exception
 	{
 		for(int i=0;i<al.size-1;i++)
 		{
 			Integer name= (Integer)al.get(i);
 			System.out.println("name");
 		}
 	}
 }