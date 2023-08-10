

  class abc
{
 void house()
 {

 	System.out.println("start");
 }

}
   class xyz extends abc
{
	abc e=new abc();
	void play()
	{
		System.out.println("no start");
	}
}

class Test
{
	public static void main(String[] args)throws Exception

	 {
		System.out.println("chetan");
		xyz t1 = new xyz();
		t1.play();
		t1.house();
	}
}
