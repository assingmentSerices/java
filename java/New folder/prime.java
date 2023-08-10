class Prime
{
static public void main(String args[])
{
int c=0,i,j;
for(i=1;i<=300;i++)
{
c=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{	
c++;
break;
}
}					
if(c==0)
System.out.println(i);
}
}
}