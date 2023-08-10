import java.util.Scanner;
class Test
{
 	//0 for o
 	//-1 for x
 	static int Values[]={2,2,2,2,2,2,2,2,2};
 	boolean isActive =true;
 	static int winPos[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8,},{2,4,6}};
     static int currentUser=-1;
     public static void main(String[] args)
      {
     	//draw();
     	while(true)
     	{
     	play();
        }
     	//while(true)
     }
     public static void checkWin()
     {
     	for(int i[]:winPos)
     {
     	if(Values[i[0]]==Values[i[1]]&&Values[i[0]]==Values[i[2]]&&Values[i[0]]!=2)
		{
			draw();
			System.out.println((currentUser==0?"O":"x")+" win the game   ");
			System.out.println((currentUser!=0?"O":"x")+" loss the game , Better Luck next  bbbbb  ");
			System.exit(1);
		}    
     }		

     }
     public static void play()
     {
     	draw();
     	System.out.print((currentUser==-1?"X":"O")+"   You turn ");
     	Scanner sc=new Scanner(System.in);
     	
	    int ch=sc.nextInt();     	
        if(Values[ch-1]==2)
        {
        	Values[ch-1]=currentUser;
     		checkWin();
     		currentUser=currentUser==-1?0:-1;
     	}
     	
     	else
     	{
     		play();
     	}
     }
     public static void draw()
     {
     	System.out.println("\n");
     	int t=1;
     	int i;
     	for(i=0;i<9;i++)
     	{
     		if(Values[i]==0)
     		{
     			System.out.print("|o");
     		}
     		else if(Values[i]==-1)
     		{
     			System.out.print("|x");
     		}
     		else
     		{
     			System.out.print("|"+t);
     		}
     		t++;
     		if((i+1)%3==0)
     			System.out.println();
     	}
     }
     
    

}