import java.util.Scanner;
class a{

static int getCountofones(int n,int m,String s)

{
 StringBuffer sb=new StringBuffer(s);
 System.out.print(sb.reverse());

return 0;
}

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
Scanner in=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
String s=in.nextLine();
System.out.print(getCountofones(i,j,s));
    
}
}