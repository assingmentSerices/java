import java.util.Scanner;
class a
{

	public static void main(String[] args){
        int p=0;
        String s="";
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {

            char c=str.charAt(i);
            if(Character.isDigit(c))

            	s+=c;
            else
            {
                if(s=="")
                s="";
            	p+=Integer.parseInt(s);
            	s="0";
            }

        }
        System.out.print(p+Integer.parseInt(s));
}
}