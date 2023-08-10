class outer
{
	class inner
	{
		public  void m1()
		{
	      
	        {
	     	  System.out.println("constcuter");
	        }
        	{
	    	 System.out.println("non-static");
	        }
	   //static
	        {
	    	 System.out.println("static-block");
         	}
		}
		
		}
	
	
	public static void main(String[] args) {
			//System.out.println("100");
			new outer().new inner().m1();
		}
}