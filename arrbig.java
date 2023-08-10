class arrbig{
	public static void main(String[] args)
	{
		int arr[]={12,44,11};
		int i;
		for(i=0;i<3;i++)
		{
		if(arr[0]>arr[1])
		{
			System.out.println("arr[0]");
			break;
		}
		if(arr[1]>arr[2])
		{
		 System.out.println("arr[1]");
		 break;
		}
		else
		{
		System.out.println("arr[2]");
		break;
		}
		}
	}
}