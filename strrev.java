class Stringrev
{
	static void rev(String str)
	{
	int s=0,e;
	char ch[]=str.toCharArray();
	e=ch.length-1;
	while(s<e)
	{
	char c=ch[s];
	ch[s]=ch[e];
	ch[e]=c;
	s++;
	e--;
	}
	System.out.println(ch);
	}

	public static void main(String[] args){
		String s = "chetankushwah";
		rev(s);
	}
}