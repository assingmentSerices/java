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
		Weeks b[]=Weeks.values();
		for(int i=0;i<b.lenth;i++)
			System.out.println(b[i].def);
	}
}
