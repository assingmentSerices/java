// enum  Weeks
// {
// 	Sun("sunday"),Mon("monday"),Tues("tuesday"),Wed("wednesday"),Thu("thusday"),Fri("friday"),Star("starday");
// 	String def;
// 	Weeks(String def)
// 	{
// 		this.def=def;
// 	}
// }
// class Test
// {
// 	public static void in(String[] args) 
// 	{
// 		Weeks b[]=Weeks.values();
// 		for(int i=0;i<b.length;i++)
// 			System.out.println(b[i].def);
// 	}
// }




 enum  Weeks
{
	Sun("sunday"),Mon("monday"),Tues("tuesday"),Wed("wednesday"),Thu("thusday"),Fri("friday"),Star("starday");
	String def;
	Weeks(String def)
	{
		this.def=def;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Weeks b;
		b=Weeks.Mon;
		switch(b)
		{
			case Mon:
			System.out.println("week start");
			break;
			case Tues:
			System.out.println("week second day");
			case Wed:
			System.out.println("week thred day");
			case Thu:
			System.out.println("week mid day");
			case Fri:
			System.out.println("before weekend");
			case Star:
			System.out.println("weekend");
			case Sun:
			System.out.println("holiday");
			
	

		}
	}
}













